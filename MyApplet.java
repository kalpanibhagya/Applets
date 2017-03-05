import java.awt.Graphics;
import javax.swing.JApplet;

public class MyApplet extends JApplet {
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Hello, Java Applet !", 20, 20);
	}

}
