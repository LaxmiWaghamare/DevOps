//Client Program...

import java.net.*;
import java.util.*;
import java.io.*;

class ClientChatApplication
{
	public static void main(String args[])throws IOException
	{
		Socket s1=new Socket("localhost",8787);
		
		Scanner sc=new Scanner(System.in);
		DataInputStream din=new DataInputStream(s1.getInputStream());
		DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
		
		String str="";
		
		while(!str.equals("bye"))
		{	
			str=sc.nextLine();
			dout.writeUTF(str);
			str=din.readUTF();
			System.out.println("Server Says:"+str);
		}
		s1.close();
	}
}