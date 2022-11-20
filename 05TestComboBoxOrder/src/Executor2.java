import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Executor2 {
	JFrame frame = new JFrame("frame");
	JPanel panel1= new JPanel();
	String a="aaa";
	String b="bbb";
	String c="ccc";			

	/**
	 * use Collection to sort a class object
	 */
	List<Interface1> list = new ArrayList<Interface1>();
//	TestClass1 a1=new TestClass1("aaa");
//	TestClass1 b1=new TestClass1("bbb");	
//	TestClass1 c1=new TestClass1("ccc");
	Interface1 t1 = new TestClass1("test1");
	Interface1 a1 = new AestClass1("aest1");
	Interface1 c2 = new CestClass2("cest2");
	
	public void execute()
	{
		System.out.println("execute");
		list.add(t1);
		list.add(a1);
		list.add(c2);
		
		Collections.sort(list,new FilterViewComparator());
		
		
	//	DefaultComboBoxModel<TestClass1> model = new DefaultComboBoxModel<TestClass1>(tc1);           //for array
	//	JComboBox comboBox=new JComboBox(model);
		
		JComboBox<Interface1> comboBox=new JComboBox<Interface1>();
		for(Interface1 tc1:list)
		{
			System.out.println("tc1:"+tc1.getValue1());
			comboBox.addItem(tc1);
		}
		System.out.println("creating panel");
		panel1.add(comboBox);
		frame.add(panel1);
		frame.pack();
		frame.setVisible(true);
		System.out.println("end");
}


private class FilterViewComparator implements Comparator<Interface1>
{

    /**
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare( Interface1 o1, Interface1 o2 ) {
        System.out.println( "comparing:"+o1.getClass()+ " and "+o2.getClass()+"  result:"+o1.getClass().compareTo(o2.getClass() )) ;
        return o1.getClass().compareTo(o2.getClass());
    }                
}
}
