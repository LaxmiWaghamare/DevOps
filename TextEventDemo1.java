import java.awt.*;
import java.awt.event.*;
 public class TextEventDemo1  extends Frame implements  TextListener
{
TextField tf1;
Label l1,l2;
   TextEventDemo1()
   {
     FlowLayout f=new FlowLayout();
	 setLayout(f);
	 
	 tf1=new TextField(20);
	 l1=new Label("                                                          ");
	 l2=new Label("                                                          ");
	 
	 add(tf1);
	 add(l1);
	 add(l2);
	 tf1.addTextListener(this);
	 
   }
   public void textValueChanged(TextEvent e)
   {
     l1.setText("typing...");
	 l2.setText(tf1.getText());
   }
   public static void main(String args[])
   {
     TextEventDemo1 f1=new TextEventDemo1();
	 f1.setVisible(true);
	 f1.setTitle("TextEvent Demo");
	 f1.setSize(500,600);
   }
}