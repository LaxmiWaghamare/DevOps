import java.awt.*;
import java.awt.event.*;
import java.applet.*;
  public class MouseDemo3 extends Applet implements MouseMotionListener
{
  public void init()
  {
    addMouseMotionListener(this);
  }
 
 public void mouseDragged(MouseEvent me)
  {
    setBackground(Color.yellow);
	showStatus("Mouse Dragged");
  }
   
   
   public void mouseMoved(MouseEvent me)
  {
    setBackground(Color.green);
	showStatus("Mouse Moved");
 }
 
  
}
/*
<applet code="MouseDemo3.class" width="500" height="500">
</applet>
*/