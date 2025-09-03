import java.awt.*;
import java.awt.event.*;

class panel1 extends Panel
{
    
      panel1()
  {
     FlowLayout f1=new FlowLayout();
     setLayout(f1);
     Button b1=new Button("EAST Resion");
     add(b1);
    }
}  
class panel2 extends Panel
{
    
      panel2()
  {
     FlowLayout f1=new FlowLayout();
     setLayout(f1);
     Button b2=new Button("WEST Resion");
     add(b2);
    }
}  
class panel3 extends Panel
{
    
      panel3()
  {
     FlowLayout f1=new FlowLayout();
     setLayout(f1);
     Button b3=new Button("NORTH Resion");
     add(b3);
    }
}
class panel4 extends Panel
{
    
      panel4()
  {
     FlowLayout f1=new FlowLayout();
     setLayout(f1);
     Button b4=new Button("SORTH Resion");
     add(b4);
   
       }
}
class MainFrameWindow extends Frame implements ActionListener
{
Button bt1,bt2,bt3,bt4;

MainFrameWindow()
{
   BorderLayout b1=new BorderLayout();
setLayout(b1);
Panel mainpanel=new Panel();
bt1=new Button("Show panel1");
bt2=new Button("Show panel2");
bt3=new Button("Show panel3");
bt4=new Button("Show panel4");
mainpanel.add(bt1);
mainpanel.add(bt2);
mainpanel.add(bt3);
mainpanel.add(bt4);

add(mainpanel,BorderLayout.CENTER);
bt1.addActionListener(this);
bt2.addActionListener(this);
bt3.addActionListener(this);
bt4.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
  
 if(ae.getSource()==bt1)
  {
  panel1 p1=new panel1();
  add(p1,BorderLayout.EAST);
}
 else if(ae.getSource()==bt2)
{
  panel2 p2=new panel2();
  add(p2,BorderLayout.WEST);
}
else if(ae.getSource()==bt3)
{
  panel3 p3=new panel3();
  add(p3,BorderLayout.NORTH);
}
 else if(ae.getSource()==bt4)
{
  panel4 p4=new panel4();
  add(p4,BorderLayout.SOUTH);
 }
}
public static void main(String args[])
    {
MainFrameWindow m1=new MainFrameWindow();
m1.setVisible(true);
m1.setTitle("Frame");
m1.setSize(500,500);

       }
}


