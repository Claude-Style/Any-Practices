import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;


public class Main {
	public static void main(String[] args)
	{
		System.out.println("start");
		JFrame frame = new JFrame("the Frame");
		JPanel panel = new JPanel(new FlowLayout());
		JLabel spinnerText = new JLabel("the spinner");		
		JSpinner spinner = new JSpinner();
		panel.add(spinnerText);
		panel.add(spinner);
		frame.add(panel);
		
		
		System.out.println("added");
		frame.setSize(new Dimension(100,200));
		System.out.println("dimention set");
		try
		{
			frame.pack();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("packed");
		frame.setLocation(150, 230);
		frame.setVisible(true);
		System.out.println("set visible to true");
		
	}
}
