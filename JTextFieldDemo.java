  import javax.swing.JFrame;
  import javax.swing.JLabel;
  import javax.swing.JButton;
  import java.awt.event.*;
  import javax.swing.JOptionPane;
  import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame implements ActionListener
{
   JLabel n1,n2,title;
   JTextField t1,t2;
   JButton b;
   
   public JTextFieldDemo()
   {
	   setLayout(null);
    setVisible(true);
	setSize(500,500);
	setTitle("JTextField Demo");
	
	title=new JLabel("Addition of to Numbers");
	title.setBounds(210,50,150,20);
	
	n1=new JLabel("Enter Number 1:");
	n1.setBounds(150,100,100,20);
	
	t1=new JTextField(10);
	t1.setBounds(260,100,90,20);
	
	n2=new JLabel("Enter Number 2:");
	n2.setBounds(150,140,100,20);
	
	t2=new JTextField(10);
	t2.setBounds(260,140,90,20);
	
	b=new JButton("SUBMIT");
	b.setBounds(250,170,100,20);
	b.addActionListener(this);
	add(title);
	add(n1);
	add(n2);
	add(t1);
	add(t2);
	add(b);
	
  }
  public void actionPerformed(ActionEvent e)
  {
  
  if(t1.getText().equals("")&&t2.getText().equals(""))
  JOptionPane.showMessageDialog(null,"Enter Numbers");
  else
  {
   int n1=Integer.parseInt(t1.getText());
   int n2=Integer.parseInt(t2.getText());
   int sum=n1+n2;
   JOptionPane.showMessageDialog(null,"Addition "+n1+ " and " +n2+ " = " +sum);
   }
  }
  public static void main(String args[])
  {
  
	 new JTextFieldDemo();
  }
   
}