import java.net.*;
import java.io.*;
public class servers {
    public static void main(String[] args) throws IOException{
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
    }
}
