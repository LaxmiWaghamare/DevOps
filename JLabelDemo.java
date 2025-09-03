import java.awt.*;
import javax.swing.*;

public class JLabelDemo extends JFrame
{
JLabelDemo()

  {
     Container c=getContentPane();
     FlowLayout f1=new FlowLayout();
     c.setLayout(f1);
     JLabel L1=new JLabel("Fashine made's Womens perfect!!!!!");
     ImageIcon ii=new ImageIcon("C:/Advance java/mackup 11.jpg");
     JLabel L2=new JLabel(ii);
     c.add(L1);
	 c.add(L2);
   } 
 public static void main(String  args[])
  {
  JLabelDemo f1=new JLabelDemo();
  f1.setVisible(true);
  f1.setSize(500,500);
  f1.setTitle("JLabel Demo");
  }

}