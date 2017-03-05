import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

//javax.swing.*

public class MyApplet2 extends JApplet {
	private int total;
	
	public void init(){
		String num1,num2;
		
		//Getting user inputs
		num1 = JOptionPane.showInputDialog("Enter your first number: ");
		num2 = JOptionPane.showInputDialog("Enter your first number: ");
		
		int number1,number2;
		
		//Convert string numbers into integers
		number1 = Integer.parseInt(num1);
		number2 = Integer.parseInt(num2);
		
		total = number1 + number2; // adding
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Hello, Java Applet !", 20, 20);
		g.drawString("The total is : "+total, 50, 50); //print total
	}
	

}
