import java.net.*;

class InetAddressTest
{
  public static void main(String args[])
  throws UnknownHostException
  {
    InetAddress addr=InetAddress.getLocalHost();
	System.out.println(addr);
	InetAddress addr1=InetAddress.getByName("msbte.org.in");
	System.out.println(addr1);
	InetAddress addr2[]=
	InetAddress.getAllByName("www.google.com");
	for(int i=0; i<addr2.length; i++)
	System.out.println(addr2[i]);
  }
}