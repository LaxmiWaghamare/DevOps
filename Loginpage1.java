//Login Page
import java.awt.*;
class Loginpage1 extends Frame
{
	Loginpage1()
	{
		setLayout(null);
		setBackground(Color.cyan);
		Label L1=new Label("LAXMI SOFTWARE PVT LTD");
		L1.setForeground(Color.red);
		setForeground(Color.black);
		Label L2=new Label("Enter User Name:");
		Label L3=new Label("Enter Password:");
		
		TextField tf1=new TextField(30);
		TextField tf2=new TextField(30);
		tf2.setEchoChar('*');
		Button b1=new Button("Login");
		Font f1=new Font("Arial black",Font.BOLD|Font.ITALIC,25);
		Font f2=new Font("Arial black",Font.BOLD,18);
		L1.setFont(f1);
		L2.setFont(f2);
		L3.setFont(f2);
		b1.setFont(f2);
		L1.setBounds(50,50,500,80);
		L2.setBounds(50,180,180,40);
		tf1.setBounds(260,180,160,40);
		L3.setBounds(50,260,180,40);
		tf2.setBounds(260,260,160,40);
		b1.setBounds(150,340,150,50);
		add(L1);
		add(L2);
		add(L3);
		add(tf1);
		add(tf2);
		add(b1);
		
	}
	public static void main(String args[])
	{
	  Loginpage1 f1=new Loginpage1();
	  f1.setVisible(true);
	  f1.setTitle("Login Form");
	  f1.setSize(500,500);
	}
}