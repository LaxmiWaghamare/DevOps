import java.net.*;
class InetAddressDemo 
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println("Local Host Name:"+addr);
		addr=InetAddress.getByName("msbte.org.in");
		System.out.println("getByName Method Output:"+addr);
		InetAddress a[]=InetAddress.getAllByName("www.facebook.com");
		System.out.println("Is Multicast Address="+addr.isMulticastAddress());
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}