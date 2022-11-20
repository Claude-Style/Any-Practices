

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.transdyn.dynac.validation.PatternTextComponentValidator;

public class TestStringValidator {

	
/**
 * To test this function, copy this to package com.transdyn.dynac.cctv.registry.configuration;
 * 	
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Frame1");
		JPanel panel = new JPanel(new FlowLayout());
		JTextField jtfield = new JTextField(40);
//		PatternTextComponentValidator cameraIdTextFieldValidator;
		PatternTextComponentValidator cameraIdTextFieldValidator;
		final String URL_PATTERN = "^(rtsp://){1}([0-9]+).[0-9]+.[0-9]+.[0-9]+(:{1})+([0-9])+(/{1})([./a-zA-Z0-9_?\\-=]+)";		
		final String CCL_URL_PATTERN = "^([0-9]+).[0-9]+.[0-9]+.[0-9]+(:{1})+([0-9]+)";
		// originally  "^(rtsp://){1}([0-9]+).[0-9]+.[0-9]+.[0-9]+(/{1})([./a-zA-Z0-9_?\\-=]+)"; without port number part 		
//        cameraIdTextFieldValidator = new PatternTextComponentValidator( "^([0-9]+)", jtfield );   //test only permit numbers
		  cameraIdTextFieldValidator = new PatternTextComponentValidator( URL_PATTERN, jtfield );   //test with URL
		
		panel.add(jtfield);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
