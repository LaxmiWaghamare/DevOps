import java.awt.*;
import javax.swing;


public class JLabelDemo extends JFrame
{
JLabelDemo()

  {
     Container c=getContainer();
     FlowLayout f1=new FlowLayout();
     c.setLayout(f1);
     JLabel L1=new JLabel("Girls Fashin");
     ImageIcon iil=ImageIcon("C:/Advance java/shenaaz 1.jpg");
     JLabel L2=new JLabel(iil);
     c.add(L1);
	 c.add(L2);
   } 
 public static void main(Sring args[])
  {
  JLabelDemo f1=new JLabelDemo();
  f1.setVisible(true);
  f1.setSize("500,500");
  f1.setTitle("JLabel Demo");
  }

}