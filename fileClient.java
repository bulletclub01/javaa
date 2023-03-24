import  java.io.*;
import java.net.*;
public class fileClient {
    public static void main(String[] args) throws IOException{
        Socket s=new Socket(InetAddress.getLocalHost(),4000);
        System.out.println("Enter file Name : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String fname=br.readLine();
        OutputStream os=s.getOutputStream();
        PrintWriter pwrite=new PrintWriter(os,true);
        pwrite.println(fname);
        InputStream istream=s.getInputStream();
        BufferedReader soc=new BufferedReader(new InputStreamReader(istream));
        String str;
        while((str = soc.readLine())  !=  null)
        {
            System.out.println(str);
        }
        pwrite.close();
        soc.close();
        br.close();
    }
}




