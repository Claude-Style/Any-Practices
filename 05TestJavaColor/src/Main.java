import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel jlabel = new JLabel();
		
		Color testColor = new Color(32,42,56);
		
		jlabel.setBackground(testColor);
		panel.add(jlabel);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
