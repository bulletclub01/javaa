import java.net.*;
import java.io.*;
public class clients {
    public static void main(String[] args) throws IOException{
        ServerSocket soc=new ServerSocket(8020);
        Socket so=soc.accept();
        DataInputStream di = new DataInputStream(so.getInputStream());
        String st = di.readLine();
        System.out.println(st);


    }

        }