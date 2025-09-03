import javax.swing.*;
import java.awt.*;
class JTableDemo extends JFrame
{
  JTableDemo()
  {
   Container c=getContentPane();
   
   String cols[]={"RollNO","Name","Marks"};
   String data[][]={ 
                      {"101","Laxmi","99.9"},
                      {"102","Shrddha","98.88"},
					  {"103","Prajkta","98.34"},
					  {"104","Arati","98.44"}
					};
   
   JTable jt=new JTable(data,cols);
   int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
   int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
   JScrollPane jsp=new JScrollPane(jt,v,h);
   c.add(jsp);
  }
  public static void main(String args[])
  {
  JTableDemo f1=new JTableDemo();
  f1.setVisible(true);
  f1.setTitle("JTable Demo");
  f1.setSize(500,400);
  }
}