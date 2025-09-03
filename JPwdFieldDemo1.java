import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class JPwdFieldDemo1 extends JFrame implements ActionListener
{
   JLabel name,pwd,title;
   JTextField tf;
   JPasswordField jp;
   JButton b;
   
   public JPwdFieldDemo1()
   {
	   setLayout(null);
    setVisible(true);
	setSize(500,500);
	setTitle("JPasswordField Demo");
	
	title=new JLabel("Login Page");
	title.setBounds(210,50,90,20);
	
	name=new JLabel("Username");
	name.setBounds(150,100,90,20);
	
	tf=new JTextField(40);
	tf.setBounds(260,100,90,20);
	
	pwd=new JLabel("Password");
	pwd.setBounds(150,140,90,20);
	
	jp=new JPasswordField();
	jp.setBounds(260,140,90,20);
	jp.setEchoChar('#');
	
	b=new JButton("SUBMIT");
	b.setBounds(210,180,90,20);
	
	add(title);
	add(name);
	add(tf);
	add(pwd);
	add(jp);
	add(b);
	b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
  int count=jp.getText().length();
  if(tf.getText().equals("")&&jp.getText().equals(""))
     JOptionPane.showMessageDialog(null,"Enter Username and Password");
  else if(count<6)
      JOptionPane.showMessageDialog(null,"password length must be >6 charecters");
  else
    JOptionPane.showMessageDialog(null,"Login Successfully!!!!!");
  }
  public static void main(String args[])
  {
  
		new JPwdFieldDemo1();
  }
   
}