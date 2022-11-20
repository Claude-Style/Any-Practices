import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listS=new ArrayList<String>();
		listS.add("aaa");
		listS.add("bbb");
		listS.add("ccc");
		
		System.out.println("1:"+((String)(listS.iterator().next())));
		System.out.println("2:"+((String)(listS.iterator().next())));
		System.out.println("3:"+((String)(listS.iterator().next())));
				
	}

}
