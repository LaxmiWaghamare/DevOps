import java.awt.*;
import java.applet.*;
class ListDemo extends applet
{
 public void init()
{
   ListDemo L1=new ListDemo(4);
   L1.add("Marathi");
   L1.add("Hindi");
   L1.add("English");
   L1.add("Sanskrit");
   add(L1);
}

}
/*
<applet code="ListDemo" Width=500 Hight=500>
</applet>
*/