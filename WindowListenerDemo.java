import java.awt.*;
import java.awt.event.*;
import java.applet.*;


 class WindowListenerDemo extends Applet implements WindowListener
{
   String str="See your event hear..";
   
    public void init()
	{
	  this.addWindowListener(this);
	}
	
	public void paint(Graphics g)
	{
	 g.drawString(str,100,100);
	}
	public void windowActivated(WindowEvent we)
	{
	 str="Window Activated";
	 repaint();
	}
	public void windowDeactivated(WindowEvent we)
	{
	 str="Window diactivated";
	 repaint();
	}
	public void windowIconified(WindowEvent we)
	{
	 str="Window iconified";
	 repaint();
	}
	public void windowDeiconified(WindowEvent we)
	{
	 str="Window deiconified";
	 repaint();
	}
	public void windowClosed(WindowEvent we)
	{
	 str="Window closed";
	 repaint();
	}
	public void windowClosing(WindowEvent we)
	{
	 str="Window closing";
	 repaint();
	}
	public void windowOpened(WindowEvent we)
	{
	 str="Window opened";
	 repaint();
	}
	public void windowExited(WindowEvent we)
	{
	 str="Window exited";
	 repaint();
	}
   }
/*
 <applet code="WindowListenerDemo.class" width="500" height="500">
 </applet>
*/