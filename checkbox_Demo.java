import java.applet.*;
import java.awt.*;

 public class checkbox_Demo extends Applet
{
 public void init()
{

Checkbox chb1=new Checkbox("Piza");
Checkbox chb2=new Checkbox("Hot-dog",true);
Checkbox chb3=new Checkbox("Burger");
Checkbox chb4=new Checkbox("Pasttry");
add(chb1);
add(chb2);
add(chb3);
add(chb4);

  }
}
/*
<applet code="checkbox_Demo" width="500" height="500">
</applet>
*/
