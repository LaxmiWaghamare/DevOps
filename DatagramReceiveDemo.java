//Datagram Receive...

import java.net.*;
import java.io.*;

class DatagramReceiveDemo
{
		public static void main(String args[])throws IOException
		{
				DatagramSocket ds=new DatagramSocket(8181);
				byte data[]=new byte[1024];
				DatagramPacket dp=new DatagramPacket(data,1024);
				ds.receive(dp);
				String str=new String(dp.getData(),0,dp.getLength());
				System.out.println(str);
				ds.close();	
		}
}