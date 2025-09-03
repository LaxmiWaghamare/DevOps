import javax.swing.*;
import java.awt.*;
class JProgressBarDemo1 extends JFrame
{
  JProgressBar jp;
  JProgressBarDemo1()
  {
   Container c=getContentPane();
   c.setLayout(null);
   
   jp=new JProgressBar(0,2000);
   jp.setStringPainted(true);
   jp.setBounds(40,40,160,30);
   jp.setValue(1000);
   c.add(jp);
   
   }
   void setProgressBarValue()
   {
    int i=0;
	while(i<=2000)
	{
	  jp.setValue(i);
	  i=i+=20;
	  try
	  {
		 Thread.sleep(150); 
	  }
	catch(Exception e){}
	}
   }
  public static void main(String args[])
  {
  JProgressBarDemo1 f1=new JProgressBarDemo1();
  f1.setVisible(true);
  f1.setTitle("JProgressBar Demo1");
  f1.setSize(500,400);
  f1.setProgressBarValue();
  }
}