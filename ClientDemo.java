
import java.net.*;
import java.io.*;

class ClientDemo
{
 public static void main(String args[])throws IOException
 {
   Socket s1=new Socket("localhost",8085);
   InputStream in=s1.getInputStream();
   OutputStream out=s1.getOutputStream();
   byte b[]="Hello Server".getBytes();
   out.write(b);
   s1.close();
 }
 
}