import java.awt.*;
import java.applet.*;
 public class choice1 extends applet
{
 public void init()
{
   Choice ch1=new Choice();
   Choice ch2=new Choice();
   ch1.add("Piza");
   ch1.add("Hot dog");
   ch1.add("Baegger");
   ch1.add("Pastry");
   ch2.add("Breckfast");
   ch2.add("Lunch");
   ch2.add("Dinner");
add(ch1);
add(ch2);

}
}
/*
 <applet code="choice1" width=500 hight=500>
*/