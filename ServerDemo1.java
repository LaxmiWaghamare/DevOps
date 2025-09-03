//Server program
import java.net.*;
import java.io.*;
import java.util.*;

class ServerDemo1
{
 public static void main(String args[])throws IOException
 {
  ServerSocket ss=new ServerSocket(8085);
  Socket s2=ss.accept();
  Scanner sc=new Scanner(System.in);
  
   DataInputStream din=new DataInputStream(s2.getInputStream());
   DataOutputStream dout=new DataOutputStream(s2.getOutputStream());
   String msg="";
   while(!msg.equals("bye"))
   {
    msg=din.readUTF();
    System.out.println("Client Says:"+msg);
	msg=sc.nextLine();
	dout.writeUTF(msg);
   }
   s2.close();
 }
}