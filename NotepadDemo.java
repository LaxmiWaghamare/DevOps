import java.awt.*;
class NotepadDemo extends Frame
{
    
  NotepadDemo()
{
  setBackground(Color.blue);
  MenuBar mbr=new MenuBar();
  
  Menu m1=new Menu("File");
  MenuItem m11=new MenuItem("New");
  MenuItem m12=new MenuItem("New window");
  MenuItem m13=new MenuItem("Open");
  MenuItem m14=new MenuItem("Save");
  MenuItem m15=new MenuItem("Save as");
  MenuItem m16=new MenuItem("Page setup");
  MenuItem m17=new MenuItem("Print");
  MenuItem m18=new MenuItem("Exit");
 m1.add(m11);
 m1.add(m12);
 m1.add(m13);
 m1.add(m14);
 m1.add(m15);
 m1.add(m16);
 m1.add(m17);
 m1.add(m18);

Menu m2=new Menu("Edit");
  MenuItem m21=new MenuItem("Undo");
  MenuItem m22=new MenuItem("Cut");
  MenuItem m23=new MenuItem("Copy");
  MenuItem m24=new MenuItem("Paste");
  MenuItem m25=new MenuItem("Delete");
  MenuItem m26=new MenuItem("Find");
  MenuItem m27=new MenuItem("Find Next");
  
  m2.add(m21);
  m2.add(m22);
  m2.add(m23);
  m2.add(m24);
  m2.add(m25);
  m2.add(m26);
  m2.add(m27);

Menu m3=new Menu("View");
  MenuItem m31=new MenuItem("Zoom");
  MenuItem m311=new MenuItem("Zoom in");
  MenuItem m312=new MenuItem("Zoom Out");
  MenuItem m313=new MenuItem("Restore default Zoom");
   m3.add(m311);
   m3.add(m312);
   m3.add(m313);
  
CheckboxMenuItem m32=new CheckboxMenuItem("Status bar");
MenuItem m33=new MenuItem("Word wrap");
m3.add(m31);
m3.add(m32);
m3.add(m33);

mbr.add(m1);
mbr.add(m2);
mbr.add(m3);
setMenuBar(mbr);
}
public static void main(String args[])
{
   NotepadDemo n1=new NotepadDemo();
   n1.setVisible(true);
   n1.setTitle("Notepad Demo");
   n1.setSize(500,500);


}

}