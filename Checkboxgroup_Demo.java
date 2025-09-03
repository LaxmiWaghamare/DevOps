import java.applet.*;
import java.awt.*;

 public class checkboxgroup_Demo  extends Applet
{
 public void init()
{
set.Background(Color.cyan);
set.Foreground(Color.red);

CheckboxGroup cbg=new CheckboxGroup();
Checkbox chb1=new Checkbox("Piza",false,cbg);
Checkbox chb2=new Checkbox("Hot-dog",true,cbg);
Checkbox chb3=new Checkbox("Burger",false,cbg);
Checkbox chb4=new Checkbox("Pasttry",false,cbg);
add(chb1);
add(chb2);
add(chb3);
add(chb4);

  }
}
/*
<applet code="checkboxgroup_Demo" width="500" height="500">
</applet>
*/
