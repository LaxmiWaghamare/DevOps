import javax.swing.*;
import java.awt.*;
import java.applet.*;
class JPasswordDemo2 extends Applet
{
   JLabel l1,l2;
  JTextField tf1;
  JPasswordField pass;
  JButton b;
  public void init()
  {
	  
	
	  
   l1=new JLabel("Enter Username:");
   l1=new JLabel("Enter Password:");
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
	 
 
 }
 /* 
 <applet code="JPasswordDemo2.class"width=500 height=500>
 </applet>
 */