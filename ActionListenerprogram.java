import java.awt.event.*;
import java.awt.*;
  public class ActionListenerprogram extends Frame implements ActionListener
 {
	 
	 TextField tf1,tf2;
	 Button b1;
	 public ActionListenerprogram()
	 {
		 setLayout(new FlowLayout());
		 tf1=new TextField(15);
		 tf2=new TextField(15);
		 b1=new Button("Copy");
		 tf2.setEditable(false);
		 add(tf1);
		 add(b1);
		 add(tf2);
		 b1.addActionListener(this);
      }
	 public void actionPerformed(ActionEvent e)
	 {
		 String s=tf1.getText();
		 tf2.setText(s);
	 }
	 public static void main(String args[])
	 {
		ActionListenerprogram fr=new ActionListenerprogram();
		fr.setSize(500,500);
		fr.setTitle("ActionListenerprogram");
		fr.setVisible(true);
	 }
 }