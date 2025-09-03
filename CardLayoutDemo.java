import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardLayoutDemo extends JFrame implements ActionListener 
{
     CardLayout c1;
     Container c;
     
      CardLayoutDemo()
  {
     c1=new CardLayout();
     setLayout(c1);
     c=getContentPane();
    JButton b1=new JButton("C Lang");
    JButton b2=new JButton ("C++ Lang");
    JButton b3=new JButton ("Java Lang");
    JButton b4=new JButton ("Javascript Lang");
    JButton b5=new JButton ("Paython Lang");
    
    c.add(b1,"Button1");
    c.add(b2,"Button2");
    c.add(b3,"Button3");
    c.add(b4,"Button4");
    c.add(b5,"Button5");
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);

  }
public void actionPerformed(ActionEvent ae)
  {
   c1.next(c);
}
public static void main(String args[])
    {
CardLayoutDemo cd1=new CardLayoutDemo();
cd1.setVisible(true);
cd1.setTitle("Carda Layout Maneger");
cd1.setSize(500,500);

       }
}