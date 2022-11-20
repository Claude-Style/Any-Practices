import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBoxDemo implements ActionListener {
	
	/**
	 * idea of this class is from java doc
	 * url: https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
	 */	

	//Create the combo box, select item at index 4.
	//Indices start at 0, so 4 specifies the pig.
	private String[] petStrings = { "Thermal","Mono With IR" };
	private static JComboBox petList;	
	
	public ComboBoxDemo() {
		petList = new JComboBox(petStrings);
		petList.setSelectedIndex(0);
    	petList.addActionListener(this);
    	petList.setEnabled(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		new ComboBoxDemo();
//		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

    	
		frame.add(panel);
		
		panel.add(petList);               

        frame.pack();
        frame.setLocation(150, 150);
        frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	    JComboBox cb = (JComboBox)e.getSource();
	    String petName = (String)cb.getSelectedItem();
//	    updateLabel(petName);

	}
}