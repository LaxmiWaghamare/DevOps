//Card Layout:

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutExample extends JFrame implements ActionListener
{
	CardLayout card;
	JButton b1,b2,b3;
	Container c;
    OnlineTest ont;
	CardLayoutExample()
	{
		c=getContentPane();
		card=new CardLayout(300,500);
		c.setLayout(card);
		b1=new JButton("Level-1");
		
		card=new CardLayout(400,300);
		c.setLayout(card);
		
		b1.addActionListener(this);
		c.add("a",b1);
		
		ont=new OnlineTest("online test1");
        setTitle("Level-1");
        setVisible(true);        
        setSize(100,100);
	}
	public void actionPerformed(ActionEvent e)
	{
		ont.setVisible(true);
		ont.show();
		//card.next(c);
	}
	public static void main(String[]args)
	{
		CardLayoutExample c1=new CardLayoutExample();
		c1.setSize(400,400);
		c1.setVisible(true);
		c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

