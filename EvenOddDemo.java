//Login Page
import java.awt.*;
import java.awt.event.*;
class EvenOddDemo extends Frame implements ActionListener
{
	Button b1;
	TextField tf1,tf2;
	EvenOddDemo()
	{
		setLayout(null);
		setBackground(Color.pink);
		Label L1=new Label("***CHECK EVEN/ODD NUMBER***");
		L1.setForeground(Color.red);
		setForeground(Color.black);
		
		Label L2=new Label("Enter Any Number:");
		Label L3=new Label("Result:");
		
	    tf1=new TextField(30);
	    tf2=new TextField(30);
		
	    b1=new Button("Check EVEN/ODD");
		
		Font f1=new Font("Arial black",Font.BOLD|Font.ITALIC,25);
		Font f2=new Font("Arial black",Font.BOLD,18);
		L1.setFont(f1);
		L2.setFont(f2);
		L3.setFont(f2);
		b1.setFont(f2);
		tf1.setFont(f2);
		tf2.setFont(f2);
		
		L1.setBounds(50,50,500,80);
		L2.setBounds(50,180,180,40);
		tf1.setBounds(260,180,160,40);
		L3.setBounds(50,260,180,40);
		tf2.setBounds(260,260,160,40);
		b1.setBounds(150,340,200,50);
		tf2.setForeground(Color.blue);
		add(L1);
		add(L2);
		add(L3);
		add(tf1);
		add(tf2);
		add(b1);
		b1.addActionListener(this); 	
	}
	public void actionPerformed(ActionEvent ae)
	{
		int no=Integer.parseInt(tf1.getText());
		if(no%2==0)
		{	
			tf2.setText("Even Number!!!");
		}
		else
		{
			tf2.setText("Odd Number!!!");
		}
	}
	public static void main(String args[])
	{
	  EvenOddDemo f1=new EvenOddDemo();
	  f1.setVisible(true);
	  f1.setTitle("Login Form");
	  f1.setSize(500,500);
	}
}