import java.awt.*;
class MenuDemo extends Frame
{
   MenuDemo()
   {
     MenuBar mb=new MenuBar();
	 Menu m1=new Menu("Color");
	 MenuItem m11=new MenuItem("Red");
	 MenuItem m12=new MenuItem("Blue");
	 MenuItem m13=new MenuItem("Black");
	 m13.setEnabled(false);
	 m1.add(m11);
	 m1.add(m12);
	 m1.add(m13);
	 mb.add(m1);
	 setMenuBar(mb);
	 }
 public static void main(String args[])
{
  MenuDemo md=new MenuDemo();
  md.setVisible(true);
  md.setTitle("MenuBar");
  md.setSize(500,500);
} 
}