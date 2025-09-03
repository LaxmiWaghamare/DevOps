import javax.swing.*;
import java.awt.*;
 public class JSliderDemo extends JFrame
 {
	 
	 JSliderDemo()
	 {
		 Container c=getContentPane();
		 JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		 JPanel panel=new JPanel();
		 panel.add(slider);
		 c.add(panel);
		 
		 
	 }
	 public static void main(String args[])
	 {
		 
		 JSliderDemo f1=new JSliderDemo();
		 f1.pack();
		 f1.setVisible(true);
		 f1.setTitle("JSliderDemo");
		 
	 }
 }