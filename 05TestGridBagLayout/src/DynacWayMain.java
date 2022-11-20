import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DynacWayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JLabel eastLabel= new JLabel("East");
		JLabel westLabel= new JLabel("West");
		JLabel northLabel= new JLabel("North");
		JLabel southLabel= new JLabel("South");
		JLabel centerLabel= new JLabel("Center");
		JFrame frame = new JFrame("the frame");
		JPanel mainPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();        
//        constraints.anchor = GridBagConstraints.EAST;
        constraints.fill = GridBagConstraints.NONE;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;

        constraints.insets = new Insets( 10, 10, 10, 10 );
                
        eastLabel=new JLabel( "East Label" );
        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add( eastLabel, constraints );
        
        westLabel=new JLabel( "West Label" );
//        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridy = 1;
        mainPanel.add( westLabel, constraints );
		centerLabel= new JLabel("Center");
		constraints.gridx=1;
		constraints.gridy=1;
		mainPanel.add(centerLabel,constraints);
		
        northLabel=new JLabel( "North Label" );
//        constraints.anchor = GridBagConstraints.EAST;
        constraints.gridx = 0;
        constraints.gridy = 2;
        mainPanel.add( northLabel, constraints );
        southLabel=new JLabel( "South Label" );
        constraints.gridy = 3;
        mainPanel.add(southLabel,constraints);
		frame.add(mainPanel);
		frame.pack();
		frame.setVisible(true);
		
	}

}
