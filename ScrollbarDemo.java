import java.awt.*;
class ScrollbarDemo extends Frame
{
	ScrollbarDemo()
{
	setLayout(null);

      setBackground(Color.pink);
	Scrollbar sb1=new 
      Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
      Scrollbar sb2=new 
      Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
 sb1.setBackground(Color.red);
 sb2.setBackground(Color.yellow);
 sb1.setBounds(450,40,50,420);
 sb2.setBounds(10,450,420,50);
add(sb1);
add(sb2);
}
      public static void main(String args[]) 

{
	ScrollbarDemo f1=new ScrollbarDemo();
	f1.setVisible(true);
	f1.setTitle("Scrollbar Demo");
	f1.setSize(500,500);


        }
 	}