import java.awt.*;
class GridLayoutDemo extends Frame
{
   GridLayoutDemo()
{
  GridLayout GL=new GridLayout(5,5);
setLayout(GL);
for(int i=1;i<=25;i++)
{
    add(new Button("Button "+i));
}

}
public static void main (String args[])
{
   GridLayoutDemo g1=new GridLayoutDemo();
   g1.setVisible(true);
   g1.setTitle("GridLayout Demo");
   g1.setSize(500,500);

 }
}