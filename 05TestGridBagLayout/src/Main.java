import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args)
	{
		JLabel eastLabel= new JLabel("East");
		JLabel westLabel= new JLabel("West");
		JLabel northLabel= new JLabel("North");
		JLabel southLabel= new JLabel("South");
		JLabel centerLabel= new JLabel("Center");
		JFrame frame = new JFrame("the frame");
		JPanel gridPanel1= new JPanel(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		
//		constraints.anchor = GridBagConstraints.EAST;
//		constraints.fill=GridBagConstraints.NONE;
//		constraints.weightx = 1.0;
//		constraints.weighty = 1.0;
//		constraints.insets = new Insets(3,3,3,3);

		gridPanel1.add(westLabel, constraints);

//		constraints.anchor = GridBagConstraints.EAST;
//		constraints.fill=GridBagConstraints.NONE;
//		constraints.weightx = 0.0;
//		constraints.weighty = 0.0;
//		constraints.insets = new Insets(3,3,3,3);
		gridPanel1.add(eastLabel, constraints);
		
		frame.add(gridPanel1);
		frame.pack();
		frame.setVisible(true);
	}
}
