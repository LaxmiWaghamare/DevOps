import java.awt.*;
import java.awt.event.*;
class PasswordDemo extends Frame implements ActionListener
{
   Button b1;
   TextField tf1;
   PasswordDemo()
   {
     setLayout(new FlowLayout());
	 setBackground(Color.orange);
	 b1=new Button("See Password");
	 tf1=new TextField(20);
	 tf1.setEchoChar('*');
	 
       add(tf1); 
       add(b1);
     b1.addActionListener(this);
	 
   }
   public void actionPerformed(ActionEvent ae)
   {
	   String str=ae.getActionCommand();
	   if(str.equals("see Password"))
	   {
		   tf1.setEchoChar('\0');
		   b1.setLabel("Hide Password");
	   }
	    if(str.equals("Hide Password"))
	   {
		   tf1.setEchoChar('*');
		   b1.setLabel("see Password");
		   
	   }
	   
    }  
	   public static void main(String args[])
	   {
		   PasswordDemo f1=new PasswordDemo();
		   f1.setVisible(true);
		   f1.setSize(500,500);
		   f1.setTitle("Password Demo");
	   }	   
	   
 }
