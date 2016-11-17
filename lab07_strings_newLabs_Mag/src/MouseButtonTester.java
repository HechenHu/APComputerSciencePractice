//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MouseButtonTester extends JFrame implements MouseListener
{
	private int mouseX, mouseY;
	private int mouseButton;
	private boolean isFirstRun;
	Random ran = new Random();
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;
	private static final long serialVersionUID = 0;  //use this if you do not like warnings

	public MouseButtonTester()
	{
		super("Mouse Button Tester");

		//set up all variables
		mouseX = mouseY = 0;
		mouseButton = 0;
		isFirstRun = true;

		//set up the Frame
		setSize(WIDTH,HEIGHT);
		setBackground(Color.WHITE);
		setVisible(true);

		//start trapping for mouse clicks
		addMouseListener(this);
	}
	public Color ranColor()
	{
		switch(ran.nextInt(5))
		{
		case 1:return Color.black;
		case 2:return Color.red;
		case 3:return Color.green;
		case 4:return Color.blue;
		case 5:return Color.cyan;
		}
		return null;
	}
	public void mouseClicked(MouseEvent e)
	{
		mouseX=e.getX();
		mouseY=e.getY();
		mouseButton = e.getButton();
		repaint();
	}

	public void paint( Graphics window )
	{
		if(isFirstRun)
		{
			window.setColor(Color.WHITE);
			window.fillRect(0,0,WIDTH, HEIGHT);

			isFirstRun=false;
		}
		
		
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.setColor(Color.BLUE);
		window.drawString("MOUSE BUTTON TESTER", 420,55);
		
		draw(window);
	}

	public void draw(Graphics window)
	{
		if(mouseButton==MouseEvent.BUTTON1)		//left mouse button pressed
		{
			//window.drawString("BUTTON1", 50,200);  //debug code
			window.setColor(ranColor());
			window.drawRect(mouseX,mouseY,10,10);
		}
		//right mouse button pressed
		{
			window.setColor(ranColor());
			window.drawOval(mouseX,mouseY,10,10);
		
		}
		//any other mouse button pressed
		{
		
		
		
		}
	}

	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
}