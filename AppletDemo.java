import java.applet.*;
import java.awt.*;
public class AppletDemo extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
	}
	public void paint(Graphics g)
      {
		g.drawString("Welcome to G.p.Solapor",100,150);
      }
}

/*
<applet code="AppletDemo.class" width="500" height="500">
</applet>
*/