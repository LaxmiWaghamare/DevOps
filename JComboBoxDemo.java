import java.awt.*;
import javax.swing.*;

class JComboBoxDemo extends JFrame
{
JComboBoxDemo()
{
   Container c1=getContentPane();
   c1.setLayout(new FlowLayout());


JComboBox jcb=new JComboBox();
jcb.addItem("C lang");
jcb.addItem("C++ lang");
jcb.addItem("Java lang");
jcb.addItem("Python lang");
jcb.addItem("Data Structure lang");
jcb.addItem("Android lang");

c1.add(jcb);

}
public static void main(String args[])
{

  JComboBoxDemo f1=new JComboBoxDemo();
f1.setVisible(true);
f1.setTitle("JCombo BoxDemo");
f1.setSize(500,500);
 }
}