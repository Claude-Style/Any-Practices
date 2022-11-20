package com.transdyn.dynac.gridlayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class GridMain {
	public static void main(String args[])
	{
		Frame f = new Frame("Java frame");
		f.setLayout(new GridLayout(2,1));	
		f.setLocation(300,400);
		f.setSize(300,200);
		f.setBackground(new Color(204,204,255));
		Panel p1 = new Panel(new BorderLayout());
		Panel p2= new Panel(new BorderLayout());
		Panel p11 = new Panel(new GridLayout(2,1));
		Panel p21 = new Panel(new GridLayout(2,2));
		p1.add(new Button("BUTTON1"),BorderLayout.WEST);
		p1.add(new Button("BUTTON2"), BorderLayout.EAST);
		p11.add(new Button("BUTTON3"));
		p11.add(new Button("BUTTON4"));
		p1.add(p11, BorderLayout.CENTER);
		p2.add(new Button("BUTTON5"),BorderLayout.WEST);
		p2.add(new Button("BUTTON6"),BorderLayout.EAST);
		for(int i=1;i<=4;i++)
		{
			p21.add(new Button("BUTTON_"+i));
		}
		p2.add(p21, BorderLayout.CENTER);
		f.add(p1);
		f.add(p2);
		f.setVisible(true);
	}
}
