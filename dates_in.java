import java.io.*;
import java.net.*;
import java.util.*;
class dates_in{
    public static void main(String[] args) {
        Socket s;
        try{
            InetAddress net=InetAddress.getLocalHost();
            s= new Socket(net,8020);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String date=dis.readLine();
            System.out.println(date);


        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}