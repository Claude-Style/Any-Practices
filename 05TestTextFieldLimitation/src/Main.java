import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();		
		JPanel panel = new JPanel(new FlowLayout());
		JTextField textField = new JTextField(30);
		textField.setSize(new Dimension(5,15));
		textField.setText("");
		textField.setEditable(false);
//		textField.setDisabledTextColor(Color.YELLOW);
//		textField.setDocument(new JTextFieldLimit());
		frame.add(panel);
		panel.add(textField);
		frame.pack();
		frame.setVisible(true);
	}

}
