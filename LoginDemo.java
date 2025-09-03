//Login page 
import java.awt.*;
import java.awt.event.*;
class LoginDemo extends Frame implements ActionListener
{
      Button b1;
	TextField tf1,tf2;
	Label L4;
	LoginDemo()
  {
	setLayout(null);
      setBackground(Color.cyan);
	setForeground(Color.BLUE);
	Font f1=new Font("Times New Roman",Font.ITALIC|Font.BOLD,24);
	Label L1=new Label("Laxmi Software Pvt Ltd");
	L1.setFont(f1);
	Label L2=new Label("Enter User Name:",Label.RIGHT);
	Label L3=new Label("Enter Password:",Label.RIGHT);
	Label L4=new Label("                           ");
	
	tf1=new TextField(20);
	tf2=new TextField(20);
	b1=new Button("Login");
	Font f2=new Font("Times New Roman",Font.BOLD,16);
	setFont(f2);
	L1.setBounds(100,50,350,50);
	L2.setBounds(70,150,150,30);
	tf1.setBounds(230,150,150,30);
	L3.setBounds(70,250,150,30);
	tf2.setBounds(230,250,150,30);
	b1.setBounds(160,330,120,50);
	L4.setBounds(70,390,200,50);
	tf2.setEchoChar('*');
	add(L1);add(L2);add(L3);add(L4);
	add(tf1);add(tf2);add(b1);	
	b1.addActionListener(this);
	
   }
 public void actionPerformed(ActionEvent ae)
{

	String un=tf1.getText();
	String psw=tf2.getText();
	if(un.equals("Laxmi")&&psw.equals("Laxmi8"))
 {

	L4.setText("Login Successful!!!!!!!!!!!!!");
	
 }
else
  {
	
	L4.setText("Login Fail!!!!!!!!!!!!!");
   }
	
}
     public static void main(String args[])
   {

	LoginDemo LD=new LoginDemo();
	LD.setVisible(true);
	LD.setSize(500,500);
	LD.setTitle("Laxmi Login Page");
	
    }

}