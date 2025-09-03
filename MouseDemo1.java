import java.awt.*;
import java.awt.event.*;
import java.applet.*;
  public class MouseDemo1 extends Applet implements MouseListener
{
  public void init()
  {
    addMouseListener(this);
  }
  public void mouseClicked(MouseEvent me)
  {
    setBackground(Color.CYAN);
	showStatus("Mouse Clicked");
  }
   public void mouseEntered(MouseEvent me)
  {
    setBackground(Color.GREEN);
	showStatus("Mouse Entered");
  }
   public void mousePressed(MouseEvent me)
  {
    setBackground(Color.GRAY);
	showStatus("Mouse Pressed");
  }
   public void mouseReleased(MouseEvent me)
  {
    setBackground(Color.BLUE);
	showStatus("Mouse Released");
 }
  public void mouseExited(MouseEvent me)
  {
    setBackground(Color.BLACK);
	showStatus("Mouse Exit");
	
  }
  
}
/*
<applet code="MouseDemo1.class" width="500" height="500">
</applet>
*/