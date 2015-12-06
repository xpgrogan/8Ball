import javax.swing.*;
import java.awt.*;

public class BallGUI extends Canvas
{
	public void paint(Graphics window)
	{
		String test = "Test Test Test";
		window.setColor(Color.BLACK);
		window.fillOval(100, 100, 600, 600);
		window.setColor(Color.WHITE);
		window.fillOval(300, 300, 200, 200);
		window.setColor(Color.BLACK);
		window.drawString(test, 360, 400);
	}
	
	public static void main(String[] args)
	{
		Canvas canvas = new BallGUI();
		JFrame win = new JFrame("Magic 8-Ball!");
		win.setSize(800,800);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add(canvas);
		win.setVisible(true);
	}
}
