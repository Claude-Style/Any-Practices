import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("testBorder");
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.setName("Panel 1");
		JPanel panelCenter = new JPanel();
		JPanel panelEast = new JPanel();
		JPanel panelWest = new JPanel();
		JPanel panelNorth = new JPanel();
		JPanel panelSouth = new JPanel();
		
//		Border b = new SoftBevelBorder(BevelBorder.LOWERED);    //凹下边框
//		Border b = new LineBorder(Color.black);    //单线边框
		Border b = BorderFactory.createTitledBorder("Title 1");    //标题边框
		panelCenter.setBorder(b);
		panel1.add(panelCenter,BorderLayout.CENTER);
		panel1.add(panelEast,BorderLayout.EAST);
		panel1.add(panelSouth,BorderLayout.SOUTH);
		panel1.add(panelWest,BorderLayout.WEST);
		panel1.add(panelNorth,BorderLayout.NORTH);
		frame.add(panel1);
		frame.setVisible(true);
		frame.pack();
	}

}
