import javax.swing.*;
import java.awt.*;
class Panel1 extends JPanel
{
  Panel1()
   {
      setLayout(new FlowLayout());
      JButton b1=new JButton("OK");
      JButton b2=new JButton("Cancle");
      JButton b3=new JButton("Retry");
       add(b1);
       add(b2);
       add(b3);
   }
}


class Panel2 extends JPanel
{
  Panel2()
   {
      setLayout(new FlowLayout());
      JRadioButton b1=new JRadioButton("Male");
      JRadioButton b2=new JRadioButton("Female");
      JRadioButton b3=new JRadioButton("Others");

       add(b1);
       add(b2);
       add(b3);
   }
}



class Panel3 extends JPanel
{
  Panel3()
   {
      setLayout(new FlowLayout());
      JTextField b1=new JTextField("First Name");
      JTextField b2=new JTextField("Middle Name");
      JTextField b3=new JTextField("Last Name");
      
       add(b1);
       add(b2);
       add(b3);
   }
}
class JTabbedpaneDemo extends JFrame
{
       JTabbedpaneDemo()
{
       Container c=getContentPane();
       
       Panel1 p1=new panel1();
       Panel2 p2=new panel2();
       Panel3 p3=new panel3();
    
     JTabbedPane jtb=new JTabbedPane();
  
    jtb.addTab("Tab1",p1);
    jtb.addTab("Tab2",p2);
    jtb.addTab("Tab3",p3);
    c.add(jtb);
}
public static void main(String args[])
   {
      JTabbedpaneDemo f1=new JTabbedpaneDemo();
      f1.setVisible(true);
      f1.setSize(500,500);
      f1.setTitle("My Frame");
   }
}