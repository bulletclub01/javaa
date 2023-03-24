import java.io.*;
import java.net.*;
import java.util.*;
public class dates_out {
    public static void main(String[] args) {
        try {
            while (true){
                ServerSocket ss=new ServerSocket(8020);
                Socket s=ss.accept();
                PrintStream ps=new PrintStream(s.getOutputStream());
                Date d=new Date();
                ps.print(d);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
