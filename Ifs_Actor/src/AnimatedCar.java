	import java.awt.Graphics;
	import java.awt.Color;
	import java.awt.Canvas;
public class AnimatedCar extends Canvas{

	   public AnimatedCar()    //constructor - sets up the class
	   {
	      setSize(1920,1080);
	      setBackground(Color.WHITE);
	      setVisible(true);
	   }
	   public void paint( Graphics window )
	   {
		   double i;
		   for(i=0;i<1920;i++)
		   {
			   window.clearRect(0, 0, 1920, 1080);
			   drawCar(window,(int)i*60/100);
		   }
	   }

	   public void drawCar(Graphics window ,int i)
	   {
	      window.setColor(Color.black);
		  window.fillRect(i,450, 300, 200);
		  window.setColor(Color.red);
		  window.fillOval(i, 600, 90, 90);
		  window.fillOval(i+200,600, 90, 90);
	   }
}
