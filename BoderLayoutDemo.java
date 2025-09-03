import java.awt.*;
class BorderLayoutDemo extends Frame
{
   BorderLayoutDemo()
{
  BorderLayoutDemo BL=new BorderLayoutDemo(10,10);
  setLayout(BL);
  setBackground(Color.cyan);
  
  Button b1=new Button("EAST Button");
  Button b2=new Button("WEST Button");
  Button b3=new Button("SOUTH Button");
  Button b4=new Button("NORTH Button");
  TextArea ta1=new TextArea(50,40);

add(b1,BorderLayout.EAST);
add(b2,BorderLayout.WEST);
add(b3,BorderLayout.SOUTH);
add(b4,BorderLayout.NORTH);
add(ta1,BorderLayout.CENTER);


}
public static void main(String args[])
{
  BorderLayoutDemo f1=new BorderLayoutDemo();
  f1.setVisible(true);
  f1.setTitle("BorderLayout Demo");
  f1.setSize(500,500);

  }
}