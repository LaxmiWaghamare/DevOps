import java.awt.*;
import java.applet.*;
public class Cities extends Applet
 {
   
 public void init()
  { 
    List l1=new List(10,true);
     l1.add("Korsegoan");
     l1.add("Solapur");
     l1.add("Bid");
     l1.add("Latur");
     l1.add("Kolapur");
     l1.add("Jununi");
     l1.add("pune");
     l1.add("Mumbai");
     l1.add("Manipur");
     l1.add("Bibidaefhal");
  add(l1);
}

public void paint(Graphics g)
{
 g.drawString("hii",50,50);

 }
}
/*
<applet code="Cities" width=500 height=500>
</applet>
*/