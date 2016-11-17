import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Shape extends Canvas
{
	public int x=0,y=0;
	public int xSpd=10,ySpd=10;
	 public Shape()    //constructor - sets up the class
	   {
	      setSize(1920,1080);
	      setBackground(Color.WHITE);
	      setVisible(true);
	   }
	   public void paint( Graphics window )
	   {
		   Random ran = new Random();
		   int i =0;
		   for(i=0;i<=100;i++)
		   {
			   if(x<1670&&y<830)
			   {
				   x+=xSpd;
				   xSpd+=ran.nextInt(20);
				   y+=ySpd;
				   ySpd+=ran.nextInt(20);
				   window.clearRect(0, 0, 1920, 1080);
				   printShape(window,x,y);
			   }
			   else if(x>=1670)
			   {
				   x-=xSpd;
				   xSpd+=ran.nextInt(20);
				   y-=ySpd;
				   ySpd+=ran.nextInt(20);
				   window.clearRect(0, 0, 1920, 1080);
				   printShape(window,x,y);
			   }
			   else if(y>=830)
			   {
				   x-=xSpd;
				   xSpd+=ran.nextInt(20);
				   y-=ySpd;
				   ySpd+=ran.nextInt(20);
				   window.clearRect(0, 0, 1920, 1080);
				   printShape(window,x,y);
			   }
		   }

	   }

	   public void printShape(Graphics window ,int x,int y)
	   {

		  window.setColor(Color.green);
		  window.fillRect(x,y, 250, 250);
		  window.setColor(Color.black);
		  window.fillRect(x+75, y+75, 100, 100);
		  window.setColor(Color.red);
		  window.drawLine(x+50,y,x+50,y+60);
		  window.setColor(Color.blue);
		  window.drawLine(x+100, y,x+50,y-60);
	   }
}
