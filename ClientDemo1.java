//Client program
import java.net.*;
import java.io.*;
import java.util.*;
class ClientDemo1
{
 public static void main(String args[])throws IOException
 {
   Socket s1=new Socket("localhost",8085);
   Scanner sc=new Scanner(System.in);
   DataInputStream din=new DataInputStream(s1.getInputStream());
   DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
   String msg="";
   while(!msg.equals("bye"))
   {
     
	 msg=sc.nextLine();
     dout.writeUTF(msg);
	 msg=din.readUTF();
	 System.out.println("Server Says:"+msg);
	
	 
   }
   s1.close();
 }
 
}