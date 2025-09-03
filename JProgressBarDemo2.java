import javax.swing.*;
import java.awt.*;
class JProgressBarDemo2 extends JFrame implements ActionListener {
	int i=0;
  JProgressBar jps;
  JButton b;
  JProgressBarDemo2()
  {
   Container c=getContentPane();
   setSize(500,500);
   setVisible(true);
   setLayout(new FlowLayout());
   b=new JButton("Click Here");
   b.addActionListener(this);
   jps= new JProgressBar(0,100);
   jps.setValue(1000);
   jps.setStringPainted(true);
  c.add(jps);
  c.add(b);
   
   }
   public void actionPerformed(ActionEvent e)
   {
    
     i+=5;
      jps.setValue(i);
  
   }
   public static void main(String args[])
  {
      JProgressBarDemo2 f1=new JProgressBarDemo2();
  }
}