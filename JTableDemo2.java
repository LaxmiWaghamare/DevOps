import javax.swing.*;
import java.awt.*;
class JTableDemo2 extends JFrame
{
  JTableDemo2()
  {
   Container c=getContentPane();
   
   String cols[]={"NAME","PERCENTAGE","GRADE"};
   String data[][]={ 
                      {"Ambika","99.9%","A"},
					  {"Swayam","99.2","A"},
                      {"Smaily","98.44","A"},
					  {"Rutuja","97.5","A"},
					  {"Payal","80.9%","B"},
                      {"Diksha","73.34","B"},
					  {"Arpita","66.5","C"},
					  {"Maya","55.33%","C"},
                      {"Smaily","90.44","A"},
					  {"Rutika","83.5","B"},
					  
					};
   
   JTable jt=new JTable(data,cols);
   int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
   int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
   JScrollPane jsp=new JScrollPane(jt,v,h);
   c.add(jsp);
  }
  public static void main(String args[])
  {
  JTableDemo2 f1=new JTableDemo2();
  f1.setVisible(true);
  f1.setTitle("JTable Demo1");
  f1.setSize(500,400);
  }
}