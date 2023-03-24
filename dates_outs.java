import java.io.*;
import java.net.*;
import java.util.*;
class dates_outs {
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
        catch (IOException e){
            System.out.println(e);
        }
    }
}
