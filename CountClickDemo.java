import java.awt.*;
import java.awt.event.*;
import java.applet.*;
  public class CountClickDemo extends Applet implements MouseListener
{
Label l;
  public void init()
  {
  l=new Label("Mouse Listener Demo");
  add(l);
    addMouseListener(this);
  }
 
 public void mousePressed(MouseEvent me)
  {
    setBackground(Color.yellow);
	int a=me.getClickCount();
	l.setText("No.of Click Count="+a);
	showStatus("Mouse Clicked");
  }
   
   
   public void mouseClicked(MouseEvent me)
  {
    setBackground(Color.green);
	int a=me.getClickCount();
	l.setText("No.of click count="+a);
	showStatus("Mouse Clicked");
 }
    public void mouseReleased(MouseEvent me)
  {
    setBackground(Color.green);
	int a=me.getClickCount();
	l.setText("No. of click count="+a);
	showStatus("Mouse Clicked");
 }
  public void mouseEntered(MouseEvent me)
  {
    showStatus("Mouse Clicked");
  }
  public void mouseExited(MouseEvent me)
  {
	  showStatus("mouse exited");
  }
}
/*
<applet code="CountClickDemo.class" width="500" height="500">
</applet>
*/