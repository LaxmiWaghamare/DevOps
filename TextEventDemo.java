import java.awt.*;
import java.awt.event.*;
class TextEventDemo extends Frame implements TextListener
{
  TextField tf1;
  Label L1,L2;
  TextEventDemo()
  {
   FlowLayout f1=new FlowLayout();
   setLayout(f1);
   setBackground(Color.yellow);
   tf1=new TextField(20);
   tf1.setForeground(Color.blue);
   L1=new Label("                                                   ");
   L2=new Label("                                                      ");
   L1.setForeground(Color.green);
   add(tf1);
   add(L1);
   add(L2);
   tf1.addTextListener(this);
  }
  public void textValueChanged(TextEvent te)
  {
    L1.setText("typing....");
	L2.setText(tf1.getText());
  }
  public static void main(String args[])
  {
    TextEventDemo t1=new TextEventDemo();
	t1.setVisible(true);
	t1.setTitle("TextEvent Demo");
	t1.setSize(500,500);
	
  }
}