import java.net.*;
class URLDemo
{
	public static void main(String args[])throws MalformedURLException
	{
		URL ul=new URL("https://www.vjtechacademy.in:8080/about-us");
		System.out.println("Protocol Name:"+ul.getProtocol());
		System.out.println("Host Name:"+ul.getHost());
		System.out.println("Port No:"+ul.getPort());
		System.out.println("File Path:"+ul.getFile());
	}
}