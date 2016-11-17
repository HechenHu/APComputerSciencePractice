import javax.swing.JFrame;
public class GraphicsRunner extends JFrame
{
	public GraphicsRunner()
	{

			setSize(1920,1080);

			getContentPane().add(new Shape());
			
			//add other classes to run them 
			//BigHouse, Robot, or ShapePanel 

			setVisible(true);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}



	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}

}