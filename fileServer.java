import java.io.*;
import java.net.*;
public class fileServer
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(4000);
        System.out.println("Server ready for connection");
        Socket s = ss.accept();
        System.out.println("Connection is successful and wating for Client request");


        InputStream istream = s.getInputStream( );
        BufferedReader fileRead=new BufferedReader(new InputStreamReader(istream));
        String fname = fileRead.readLine( );

        BufferedReader contentRead = new BufferedReader(new FileReader(fname) );


        OutputStream ostream = s.getOutputStream( );
        PrintWriter pwrite = new PrintWriter(ostream, true);

        String str;
        while((str = contentRead.readLine()) !=  null)
        {
            pwrite.println(str);
        }

        s.close();  ss.close();
        pwrite.close();
        fileRead.close();
        contentRead.close();
    }
}
