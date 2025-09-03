import javax.swing.*;
import java.awt.*;
public class MyProgress extends JFrame
{
  JProgressBar jb;
int i=0,num=0;
public MyProgress()
{
	 Container c=getContentPane();
	 jb=new JProgressBar(0,5000);
	 jb.setBounds(40,40,200,300);
	 jb.setValue(0);
	 jb.setStringPainted(true);
	 c.add(jb);
	 this.setSize(400,400);
	 c.setLayout(new FlowLayout());
	 
	}
public void iterate()
{
	while(i<=5000)
	{
		jb.setValue(i);
		i=i+20;
		try
		{
			Thread.sleep(150);
			
		}
		catch(Exception e){}
		
		}
	}
 public static void main(String args[])
{
	MyProgress f1=new MyProgress();
	f1.setVisible(true);
	f1.setTitle("MyProgress");
	f1.setSize(400,400);
	f1.iterate();
	
   }	
}