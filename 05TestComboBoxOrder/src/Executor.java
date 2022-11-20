import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Executor {
	JFrame frame = new JFrame("frame");
	JPanel panel1= new JPanel();
	String a="aaa";
	String b="bbb";
	String c="ccc";			

	/**
	 * use Collection to sort a class object
	 */
	List<TestClass1> list = new ArrayList<TestClass1>();
//	TestClass1 a1=new TestClass1("aaa");
//	TestClass1 b1=new TestClass1("bbb");	
//	TestClass1 c1=new TestClass1("ccc");
	
	TestClass1 a1=new TestClass1("DomainView@52a21379");
	TestClass1 a2=new TestClass1("FacilityNameView@5d792dc5");
	TestClass1 a3=new TestClass1("FirstActivatedUserView@48563dbf");
	TestClass1 a4=new TestClass1("HasClassificationView@33801141");
	TestClass1 a5=new TestClass1("IncidentNameView@717be593");
	TestClass1 a6=new TestClass1("LocationView@6578f97c");
	TestClass1 a7=new TestClass1("MessageTextView@1c3a8ba9");
	TestClass1 a8=new TestClass1("MessageTypeView@2f838b76");
	TestClass1 a9=new TestClass1("OriginatingRegisteredObjectNameView@17aa468");
	TestClass1 a10=new TestClass1("PlanNameView@236b1e22");
	TestClass1 a11=new TestClass1("RegistryDescriptionView@6b44be25");
	TestClass1 a12=new TestClass1("RegistryLocationView@58af5000");
	TestClass1 a13=new TestClass1("RegistryNameView@ca2e699");
	TestClass1 a14=new TestClass1("RegistryTypeView@77437321");
	TestClass1 a15=new TestClass1("SnoozedView@39b85e7a");
	TestClass1 a16=new TestClass1("StartTimeView@1bb5261d");
	TestClass1 a17=new TestClass1("TerminateUserView@389ddc");
	TestClass1 a18=new TestClass1("TerminationTimeView@6c8e3c81");
	TestClass1 a19=new TestClass1("UsernameView@173ef4e4");
	TestClass1 a20=new TestClass1("WorkstationNameView@2509add0");
	TestClass1 a21=new TestClass1("IdView@611b02d0");
	TestClass1 a22=new TestClass1("TimestampSourceView@7c6c4046");
	TestClass1 a23=new TestClass1("TimestampSourceView@1c9512fb");
	TestClass1 a24=new TestClass1("TimestampSourceView@749a4b94");
	TestClass1 a25=new TestClass1("AcknowledgedView@4daeda55");
	TestClass1 a26=new TestClass1("SubQueryView@535eddd6");
	TestClass1 a27=new TestClass1("AssociatedEventsView@67681f8c");
	TestClass1 a28=new TestClass1("SubQueryView@41883e1e");
	TestClass1 a29=new TestClass1("TimestampView@7a4f3808");
	TestClass1 a30=new TestClass1("SessionDomainView@5f5afafa");
	TestClass1 a31=new TestClass1("SimpleTimeView@78e91ae2");
	
	public void execute()
	{
		System.out.println("execute");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
		list.add(a8);
		list.add(a9);
		list.add(a10);
		list.add(a11);
		list.add(a12);
		list.add(a13);
		list.add(a14);
		list.add(a15);
		list.add(a16);
		list.add(a17);
		list.add(a18);
		list.add(a19);
		list.add(a20);
		list.add(a21);
		list.add(a22);
		list.add(a23);
		list.add(a24);
		list.add(a25);
		list.add(a26);
		list.add(a27);
		list.add(a28);
		list.add(a29);
		list.add(a30);
		list.add(a31);

		
		
		
		Collections.sort(list,new FilterViewComparator());
		
		
	//	DefaultComboBoxModel<TestClass1> model = new DefaultComboBoxModel<TestClass1>(tc1);           //for array
	//	JComboBox comboBox=new JComboBox(model);
		
		JComboBox<TestClass1> comboBox=new JComboBox<TestClass1>();
		for(TestClass1 tc1:list)
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


private class FilterViewComparator implements Comparator<TestClass1>
{

    /**
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare( TestClass1 o1, TestClass1 o2 ) {
        System.out.println( "comparing:"+o1.getValue1()+ " and "+o2.getValue1()+"  result:"+o1.getValue1().compareTo(o2.getValue1() )) ;
        return o1.getValue1().compareTo(o2.getValue1());
    }                
}
}
