import java.awt.*;
import java.awt.event.*;
class ItemListenerDemo extends Frame 
{
  List l1;
  Label lb;
    ItemListenerDemo()
  {
    setLayout(new FlowLayout());
	l1=new List();
	lb=new Label("See selected item here..");
	l1.add("India");
	l1.add("Australia");
	l1.add("England");
	l1.add("Bangladesh");
	l1.add("SriLanka");
	add(l1);
	add(lb);
	
	l1.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent ie)
  {
    lb.setText(l1.getSelectedItem());
	
  }
  public static void main(String args[])
  {
    ItemListenerDemo f1=new ItemListenerDemo();
	f1.setVisible(true);
	f1.setTitle(" Demostraiting ItemListener");
	f1.setSize(500,500);
  }
}