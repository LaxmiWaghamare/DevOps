import java.awt.*;
import java.awt.event.*;
class SquareDemo extends Frame
{
 Button bts;
 TextField tf1,tf2;
 Label l1,l2;
 
 SquareDemo()
 {
  FlowLayout f1=new FlowLayout();
  setLayout(f1);
  setBackground(Color.cyan);
  
  l1=new Label("Enter Number:");
  l2=new Label("Result:");
  
  tf1=new TextField(20);
  tf2=new TextField(20);
  
  bts=new Button("Square");
  
  bts.addActionListener(new InnerForSquare());
   tf1.addMouseListener(new InnerForClear());
  add(l1);add(tf1);
  add(l2);add(tf2);
  add(bts);
  
 }
 class InnerForSquare implements ActionListener
 {
   public void actionPerformed(ActionEvent ea)
   {
    int no=Integer.parseInt(tf1.getText());
	tf2.setText(""+(no*no));
   }
 }
 class InnerForClear implements MouseListener
 {
   public void mouseEntered(MouseEvent me)
   {
    
	tf1.setText(null);
	tf2.setText(null);
	
   }
   public void mouseExited(MouseEvent me){}
   public void mouseReleased(MouseEvent me){}
   public void mousePressed(MouseEvent me){}
   public void mouseClicked(MouseEvent me){}
 }
 public static void main(String args[])
 {
    SquareDemo s1=new SquareDemo();
	s1.setVisible(true);
	s1.setTitle("Square Demo");
	s1.setSize(500,400);
 }
}
