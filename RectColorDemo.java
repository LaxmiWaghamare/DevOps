import java.applet.*;
import java.awt.*;
import java.awt.event.*;


 public class RectColorDemo extends Applet implements ActionListener
{
  int flag=0;
    
   public void init()
   {
     Button b1=new Button("Green");
	 Button b2=new Button("Red");
	 Button b3=new Button("Blue");
     add(b1);
	 add(b2);
	 add(b3);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 
   }
   public void actionPerformed(ActionEvent ae)
   {
     String str=ae.getActionCommand();
	 if(str.equals("Green"))
	 {
	   flag=1;
	   repaint();
	 }
	 else if(str.equals("Red"))
	 {
	    flag=2;
	   repaint();
	 }
	 else if(str.equals("Blue"))
	 {
	    flag=3;
	  repaint();
	 }
   }
   public void paint(Graphics g)
   {
   if(flag==1)
   {
    g.setColor(Color.green);
   }
   else if(flag==2)
   {
    g.setColor(Color.red);
   }
    else if(flag==3)
   {
    g.setColor(Color.blue);
   }
   g.fillRect(200,200,200,150);
   }
}
/*
<applet code="RectColorDemo.class" width=500 height=500>
</applet>
*/