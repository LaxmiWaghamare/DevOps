import javax.swing.*;
import java.awt.*;
class JTableDemo1 extends JFrame
{
  JTableDemo1()
  {
   Container c=getContentPane();
   
   String cols[]={"ID","NAME","SALARY"};
   String data[][]={ 
                      {"101","Amit","670000"},
                      {"102","jai","780000"},
					  {"103","Sachin","700000"},
					  
					};
   
   JTable jt=new JTable(data,cols);
   int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
   int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
   JScrollPane jsp=new JScrollPane(jt,v,h);
   c.add(jsp);
  }
  public static void main(String args[])
  {
  JTableDemo1 f1=new JTableDemo1();
  f1.setVisible(true);
  f1.setTitle("JTable Demo1");
  f1.setSize(500,400);
  }
}