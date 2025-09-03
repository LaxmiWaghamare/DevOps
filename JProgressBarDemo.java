import javax.swing.*;
import java.awt.*;
class JProgressBarDemo extends JFrame
{
  JProgressBar jp;
  JProgressBarDemo()
  {
   Container c=getContentPane();
   c.setLayout(null);
   
   jp=new JProgressBar(0,3000);
   jp.setStringPainted(true);
   jp.setBounds(150,150,200,40);
   jp.setValue(1000);
   c.add(jp);
   
   }
   void setProgressBarValue()
   {
    int i=0;
	while(i<=3000)
	{
	  jp.setValue(i);
	  i=i+20;
	  try
	  {
		 Thread.sleep(100); 
	  }
	catch(Exception e){}
	}
   }
  public static void main(String args[])
  {
  JProgressBarDemo f1=new JProgressBarDemo();
  f1.setVisible(true);
  f1.setTitle("JProgressBar Demo1");
  f1.setSize(500,400);
  f1.setProgressBarValue();
  }
}