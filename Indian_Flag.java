// Indian Flag Happy Independence Day 🇮🇳
import  java.awt.*;
class Indian_Flag extends Frame
{
	public void paint(Graphics g)
	{
		// Draw Three Clor Rectangle
		g.setColor(Color.orange);
		g.fillRect(160,100,250,60);
			
		g.setColor(Color.white);
		g.fillRect(160,160,250,60);

		g.setColor(Color.green);
		g.fillRect(160,220,250,60);
	
		// Vertical Stand Creation 
		g.setColor(Color.black); 
		g.drawRect(145,100,15,400);
		
		
		//stage draw
		g.drawRect(100,500,110,20);
			g.setColor(Color.orange);
			g.fillOval(101,501,19,19);
			g.fillOval(190,501,19,19);
			
		g.setColor(Color.black); 
		g.drawRect(80,520,150,20);
			g.setColor(Color.blue);
				g.fillOval(81,521,19,19);
				g.fillOval(210,521,19,19);
		
		g.setColor(Color.black);
		g.drawRect(60,540,190,20);
			g.setColor(Color.green);
				g.fillOval(61,541,19,19);
				g.fillOval(230,541,19,19);
		//Stage ends
		
		
		// Flag Upper Circle
		g.setColor(Color.black);
		g.drawOval(142,80,20,20);
		// Flag center circle
		g.setColor(Color.blue);
		g.drawOval(250,161,59,59);
		
		
		//Flag Black Border Lines
		g.drawLine(160,100,410,100);
		g.drawLine(160,160,410,160);
		g.drawLine(160,220,410,220);
		g.drawLine(160,280,410,280);
		g.drawLine(410,100,410,280);
		
		// Animation Creation
		Font r1= new Font("AvantGarde",Font.BOLD| Font.ITALIC,18);
		g.setFont(r1);
		for(int i=0;i<5;i++)
		{
			if(i==0)
			{
			try{
				
				// X-Axis First Column '*' Printing 
				for(int j=20;j<600;j+=15)
				{
					Thread.sleep(50);
					g.setColor(Color.orange);
					g.drawString("*",20,j);
				}

				// X-Axis Second Column '*' Printing 
				for(int j=20;j<400;j+=15)
				{
					Thread.sleep(50);
					g.setColor(Color.green);
					g.drawString("*",60,j);
				}
				
				// X-Axis To Y-axis Row '*' Printing 
				for(int j=20;j<600;j+=15)
				{
					Thread.sleep(50);
					g.setColor(Color.orange);
					g.drawString("*",j,50);
				}
				
				// Y-Axis First Column '*' Printing 
				for(int k=0;k<600;k+=15)
				{	try
					{
						Thread.sleep(50);
						g.setColor(Color.orange);
						g.drawString("*",570,k);
					}
					catch(Exception E){}
				}
				
				// Y-Axis Second Column '*' Printing 
				for(int k=0;k<400;k+=15)
				{	try
					{
						Thread.sleep(50);
						g.setColor(Color.green);
						g.drawString("*",520,k);
					}
					catch(Exception E){}
				}
				
				//Down Border *
				for(int x=0;x<600;x+=15)
				{	try{
						Thread.sleep(50);
						g.setColor(Color.green);
						g.drawString("*",x,580);
					}catch(Exception E){}
				}

				Thread.sleep(1000);
				g.setColor(Color.orange);
					g.drawString("--| Happy |--",170,320);
				Thread.sleep(1000);
				g.setColor(Color.blue);		
					g.drawString("--| Independence |--",230,350);	
				Thread.sleep(1000);
				g.setColor(Color.green);
					g.drawString("--| Day |--",360,375);
				g.setColor(Color.black);
					g.drawString("--| From Laxmi Waghamare|--",310,395);
				}
				catch(Exception e){}
			}
			
			//if == 1 Then Random * Printing
			if(i==1)
			{
				try{
				Thread.sleep(500);
				g.setColor(Color.red);
				g.drawString("*",170,310);
				Thread.sleep(900);
				g.drawString("*",180,320);
				Thread.sleep(900);				
				g.drawString("*",170,330);
				Thread.sleep(900);
				g.drawString("*",290,340);
				Thread.sleep(900);
				g.drawString("*",300,360);
				Thread.sleep(900);
				g.drawString("*",290,380);
				
				g.setColor(Color.pink);
				g.drawString("*",190,280);
				Thread.sleep(900);
				g.drawString("*",300,290);
				Thread.sleep(900);				
				g.drawString("*",170,330);
				Thread.sleep(900);
				g.drawString("*",250,350);
				Thread.sleep(900);
				g.drawString("*",320,360);
				Thread.sleep(900);
				g.drawString("*",290,380);
				
				Thread.sleep(500);
				g.setColor(Color.cyan);
				g.drawString("*",130,310);
				Thread.sleep(900);
				g.drawString("*",140,320);
				Thread.sleep(900);				
				g.drawString("*",150,330);
				Thread.sleep(900);
				g.drawString("*",120,340);
				Thread.sleep(900);
				g.drawString("*",342,320);
				Thread.sleep(900);
				g.drawString("*",210,362);		
				}
				catch(Exception e){}
			}		
		}
	}
	public static void main(String args[]) throws InterruptedException
	{
		Indian_Flag f = new Indian_Flag();
		f.setVisible(true); 
		f.setSize(600,600);
		f.setTitle("Indian_Flag");
	}
}