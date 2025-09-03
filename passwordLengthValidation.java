/*design an Applet to pass username and password as parameters and check if password contains more than 8 characters*/
  import java.applet.*;
  import java.awt.*;
  public class passwordLengthValidation extends Applet
{
     String username,password;
     public void init();
{

   	username=getParameter("un");
	password=getParameter("psw");
}
	public void paint(Graphics g)
{
	int len=password.length();
	if(len>8)
{
	 g1.drawString("Srtong Password",100,100);
}
else
{
	 g1.drawString("Password length less than 8 charecters",100,100);
}

 }
}

/*
<applet code="passwordLengthValidation.class"width="500" height="500">
<param name="un" value="msbte">
<param name="psw" value="#msbte">
</applet>
*/