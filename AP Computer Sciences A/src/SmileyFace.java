import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(1920,1080);
      setBackground(Color.WHITE);
      setVisible(true);
   }
   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace(Graphics window )
   {
      window.setColor(Color.blue);
	  window.fillOval(210,100,400,400);
	  window.setColor(Color.black);
	  window.fillOval(390,275,50,50);
	  window.setColor(Color.green);
	  window.fillOval(300,200,50,50);
	  window.fillOval(500,200,50,50);
	  window.setColor(Color.red);
	  window.drawArc(210,50,400,400,-60, -60);


   }
}