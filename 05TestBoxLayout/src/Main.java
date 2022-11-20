import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	
	
	public static void main(String[] args)
	{
		JLabel label1;
		JLabel label2;
		JLabel label3;
		JLabel label4;
		JLabel label5;
		
		JTextField textField1 = new JTextField(20);
		JTextField textField2 = new JTextField(20);
		JTextField textField3 = new JTextField(20);
		JTextField textField4 = new JTextField(20);;
		JTextField textField5 = new JTextField(20);;
		
		JFrame frame = new JFrame("testFrame");
		JPanel lPanel= new JPanel();
		JPanel rPanel= new JPanel();;
		
		label1 = new JLabel("label1");
		label2 = new JLabel("label2");
		label3 = new JLabel("label3");
		label4 = new JLabel("label4");
		label5 = new JLabel("label5");
				
		lPanel.setLayout(new BoxLayout(lPanel, BoxLayout.Y_AXIS));   //x horizontal, y vertical
		rPanel.setLayout(new BoxLayout(rPanel, BoxLayout.Y_AXIS));   //x horizontal, y vertical
		lPanel.add(label1);
		rPanel.add(textField1);
		lPanel.add(label2);
		rPanel.add(textField2);
		lPanel.add(label3);
		rPanel.add(textField3);
		
		frame.add(lPanel)
		frame.add(rPanel);
		frame.pack();
		frame.setVisible(true);		
		
	}
}
