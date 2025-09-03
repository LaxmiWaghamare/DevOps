import java.awt.*;
import javax.swing.*;
import java.applet.*;
/*
<applet code="JRadioButtonDemo" height=500 width=500>
</applet>
*/

public class JRadioButtonDemo extends JApplet
{
  public void start()
  {
    Container c=getContentPane();
	c.setLayout(null);
	JRadioButton rb1=new JRadioButton("Male");
	JRadioButton rb2=new JRadioButton("Female");
	JRadioButton rb3=new JRadioButton("Other");
	JRadioButton rb4=new JRadioButton("Internet Explore");
	JRadioButton rb5=new JRadioButton("Mozill Firefox");
	JRadioButton rb6=new JRadioButton("Google Chrome");
	c.add(rb1);
	c.add(rb2);
	c.add(rb3);
	c.add(rb4);
	c.add(rb5);
	c.add(rb6);
	rb1.setBounds(30,50,100,30);
	rb2.setBounds(150,50,100,30);
	rb3.setBounds(30,100,100,30);
	rb4.setBounds(150,100,100,30);
	rb5.setBounds(270,100,100,30);
	rb6.setBounds(300,80,100,30);
	ButtonGroup bg=new ButtonGroup();
	ButtonGroup bgg=new ButtonGroup();
	bg.add(rb1);
	bg.add(rb2);
	bg.add(rb3);
	bgg.add(rb4);
	bgg.add(rb5);
	bgg.add(rb6);
  }
}