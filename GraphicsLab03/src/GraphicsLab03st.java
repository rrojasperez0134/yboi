// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random();
		
		
		// Draw Random Lines
		for(int r = 0; r < 100; r++)
		{
			int x = rnd.nextInt(340)+400;
			int y = rnd.nextInt(240)+300;
			int x1 = rnd.nextInt(300)+490;
			int y1 = rnd.nextInt(290)+300;
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red,green,blue));
			g.drawLine(x, y, x1, y1);
		}


				
		
		// Draw Random Squares
		for(int r = 0; r < 100; r++)
		{
			int x = rnd.nextInt(340)+10;
			int y = rnd.nextInt(240)+10;
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red,green,blue));
			g.fillRect(x, y, 50, 50);
		}



		
		// Draw Random Circles
		for(int r = 0; r < 100; r++)
		{
			int x = rnd.nextInt(380)+400;
			int y = rnd.nextInt(280)+10;
			int x1 = rnd.nextInt(380)+400-x;
			int y1 = rnd.nextInt(280)+10-y;
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red,green,blue));
			g.drawOval(x, y, x1, y1);
		}



		
		// Draw 3-D Box
	
	
	
	
	
	}
		
}