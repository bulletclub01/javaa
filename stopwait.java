import java.io.*;
import java.net.*;
import java.util.Scanner;

public class stopwait {

    public static void main(String args[]) throws Exception {
        stopwait sws = new stopwait();
        sws.run();
    }

    public void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of frames to be sent:");
        int n = sc.nextInt();
        Socket s = new Socket("localhost", 9999);
        PrintStream ps = new PrintStream(s.getOutputStream());

        for (int i = 0; i < n; ) {
            if (i == n-1) {
                ps.println("exit");
                break;
            }
            System.out.println("Frame no " + i + " is sent");
            ps.println(i);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String ack = br.readLine();
            if (ack != null) {
                System.out.println("Acknowledgement was Received from receiver");
                i++;
                Thread.sleep(4000);
            } else {
                ps.println(i);
            }
        }
    }
}