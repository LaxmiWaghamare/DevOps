import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ActionListenerDemo1 extends Applet implements ActionListener
{
  Button btn;
  TextField tf1,tf2,tf3;
  
   public void init()
    {
      tf1=new TextField(15);
	  tf2=new TextField(15);
	  tf3=new TextField(15);
	  btn=new Button("ADD");
	  add(tf1);
	  add(tf2);
	  add(btn);
	  add(tf3);
	  tf3.setEditable(false);
	  btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	  int a=Integer.parseInt(tf1.getText());
	  int b=Integer.parseInt(tf2.getText());
	  int c=a+b;
	  tf3.setText(""+c);
	  
	  
	} 
}
/*
<applet code="ActionListenerDemo1.class" height=500 width=500>
</applet>
*/