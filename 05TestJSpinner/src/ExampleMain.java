import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;


public class ExampleMain {
	
	/**
	 * an Example from ITEYE showing different settings of SpinnerModel
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("start");
		JFrame frame = new JFrame("the Frame");
		JPanel panel = new JPanel(new FlowLayout());
		JLabel spinnerText = new JLabel("the spinner");				
		
		
		JSpinner dateSpinner = new JSpinner();  
		SpinnerDateModel dataModel = new SpinnerDateModel();  
		dataModel.setCalendarField(Calendar.YEAR);  
		dateSpinner.setModel(dataModel);  
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy");  
		dateSpinner.setEditor(dateEditor);  
		Date d = (java.util.Date) dateSpinner.getValue();    
		//数字  
		JSpinner numSpinner = new JSpinner();  
		SpinnerModel numModel = new SpinnerNumberModel(9999, 1024, 65535, 1);  
		numSpinner.setModel(numModel);  
		//list  
		JSpinner listSpinner = new JSpinner();  
		String[] weeks = new String[] {"周一", "周二", "周三"};  
		SpinnerListModel listModel = new SpinnerListModel(weeks);  
		listSpinner.setModel(listModel);  				
		
		panel.add(spinnerText);
		panel.add(dateSpinner);
		panel.add(numSpinner);
		panel.add(listSpinner);
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
