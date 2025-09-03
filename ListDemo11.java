import java.awt.*;
import java.applet.*;
public class ListDemo11 extends Applet
 {
   
   List c;
   Integer x;
public void init()
  { 
c=new List(4,true);
List c1=new List(4,false);
 c.add("AJP");
  c.add("CSR");
 c.add("MGMT");
c.add("STG");
c1.add("OOP");
c1.add("RDM");
add(c);
add(c1);
x=c.getRows();
}

public void paint(Graphics g)
{
 g.drawString(c.getItem(1),100,250);
g.drawString(x.toString(),100,300);
 }
}
/*
<applet code="ListDemo11" width=500 height=500>
</applet>
*/