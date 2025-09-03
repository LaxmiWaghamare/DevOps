import javax.swing.*;
import java.awt.*;

class JPasswordDemo1 extends JFrame
{
   JLabel l1,l2;
  JTextField tf1;
  JPasswordField pass;
  JButton b;
  JPasswordDemo1()
  {
	  
	  
   l1=new Label("Enter Username:");
   l1=new Label("Enter Password:");
   tf1=new JTextField();
   pass=new JPasswordField();
   pass.setEchoChar('#');
   b=new JButton("Login");
   setLayout(new GridLayout(3,2));
   add(l1);
   add(tf1);
   add(l2);
   add(pass);
   add(b);
     }
	 public static void main(String args[])
	 {
		 JPasswordDemo1 f1=new JPasswordDemo1();
		 f1.setVisible(true);
		 f1.setTitle("JPassword Demo");
		 f1.setSize(500,500);
	 }
 
 }
 