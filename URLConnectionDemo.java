//URLConnection
import java.net.*;
import java.util.*;
import java.io.*;
class URLConnectionDemo 
{
  public static void main (String args[])throws IOException
  {
    URL u1=new URL("https://www.msbte.org.in");
	URLConnection u2=u1.openConnection();
	System.out.println("Date="+new Date(u2.getDate()));
	System.out.println("Type of contents="+u2.getContentType());
	System.out.println("length of contents="+u2.getContentLength());
	System.out.println("Expiration Date="+new Date(u2.getExpiration()));
	System.out.println("Last Modified Date="+new Date(u2.getLastModified()));
  }
}