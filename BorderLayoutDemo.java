import java.awt.*;
class BorderLayoutDemo extends Frame
{
 BorderLayoutDemo()
 {
 BorderLayout bl=new BorderLayout(10,10);
 setLayout(bl);
 setBackground(Color.cyan); 
 Button b1=new Button("EAST REGION");
 Button b2=new Button("WEST REGION");
 Button b3=new Button("SOUTH REGION");
 Button b4=new Button("NORTH REGION");
 
TextArea ta1=new TextArea("We are Learning BorderLayout as a part of Advance java",50,40);
 add(b1,BorderLayout.EAST);
 add(b2,BorderLayout.WEST);
 add(b3,BorderLayout.SOUTH);
 add(b4,BorderLayout.NORTH);
 add(ta1,BorderLayout.CENTER);
}

 public static void main(String args[])
 {
 BorderLayoutDemo bld=new BorderLayoutDemo();
bld.setVisible(true);
bld.setTitle("BorderLayout Demo");
bld.setSize(500,500);
 }
}