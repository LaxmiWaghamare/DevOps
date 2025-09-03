   import java.awt.*;
   class ChoiceDemo extends Frame
{
   ChoiceDemo()
 {
    setBackground(Color.cyan);
    setForeground(Color.black);
    FlowLayout f1=new FlowLayout();
   setLayout(f1);
   Choice c1=new Choice();
   c1.add("India");
   c1.add("America");
   c1.add("China");
   c1.add("Sakharwadi");
 
     add(c1);
 
 }
 
       public static void main(String args[])
 {
       ChoiceDemo cd=new ChoiceDemo();
       cd.setVisible(true);
       cd.setTitle("Choice Contrl");
       cd.setSize(500,500);
    }
}
