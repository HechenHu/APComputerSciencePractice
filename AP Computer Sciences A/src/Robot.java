import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
public class Robot extends Canvas
{
   public Robot()    //constructor - sets up the class
   {
      setSize(1920,1080);
      setBackground(Color.WHITE);
      setVisible(true);
   }
   public void paint( Graphics window )
   {
      Robot(window);
   }

   public void Robot(Graphics window )
   {
      window.setColor(Color.black);
	  window.fillOval(210,100,400,400);
	  window.setColor(Color.blue);
	  window.fillOval(390,275,50,50);
	  window.setColor(Color.CYAN);
	  window.fillOval(300,200,50,50);
	  window.fillOval(500,200,50,50);
	  window.setColor(Color.red);
	  window.drawArc(210,50,400,400,-60, -60);
	  window.setColor(Color.green);
	  window.fillRect(220,500, 400, 400);
	  window.setColor(Color.red);
	  window.drawLine(220,700,120,900);
	  window.drawLine(620, 700, 920,900);
	  window.fillOval(220, 900, 60, 90);
	  window.fillOval(540, 900, 60, 90);
   }
}

