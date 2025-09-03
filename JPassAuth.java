import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class JPassAuth extends Applet implements ActionListener
{
   JLabel l1,l2,l3;
   JTextField txt1;
   JPasswordField pass,pass1;
   JButton b;
   public void init()
   {
     l1=new JLabel("Enter Username:");
	 l2=new JLabel("Enter Password:");
	  l3=new JLabel("Conform Password:");
	  txt1=new JTextFild();
	  pass=new JPasswordField();
	  pass1=new JPasswordField();
	  
	  b=new JButton("LOgin");
	  setLyout(new GridLyout(4,2));
	  add(l1);
	  add(txt);
	  add(l2);
	  add(pass);
	  add(l3);
	  add(pass1);
	  add(b);
	  b.addActionListener(this);
   }
	  public void actionPerformed(ActionEvent ae)
	  {
	  if(ae.getSource()==b)
	  {
	    String pa1=pass.getText();
		String pa2=pass.getText();
		
		if(pa1.equals(pa2))
		{
		   JOptionPane.showMessageDialog(null,"Sucessfull...!!!");
		}
		else
		{
		JOptionPane.showMessageDialog(null,"password not Sucessfull...!!!");
		}
	  }
	  
 }
}

/*
<applet code="JPassAuth.class" width=500 height=500>
</applet>
*/