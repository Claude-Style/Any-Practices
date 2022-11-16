
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Developer("Claude", "Shao");
		Employee e3 = new Developer("Claude", "Shao");
		Manager m1 = new Manager("John","Smith");
		Employee e2 = new Manager("Claude","Shao");
		
		/*
		 * the output hashcodes are all differently
		 */
		System.out.println("e1:"+e1);
		System.out.println("e2:"+e2);
		System.out.println("e3:"+e3);
		System.out.println("m1:"+m1);     
		
		/*
		 * Comparing different objects with different subtypes with same properties by equals method
		 */
		if(e1.equals(e2))        
		{
			System.out.println("e1, e2Equals");         //the result shows equals after Employee class implements equals
		}
		else
		{
			System.out.println("e1, e2 not Equals");
		}
		
		
		// Comparing different object with same subtypes and same properties by equals method
		if(e1.equals(e3))
		{
			System.out.println("e1, e3 equals");           //the result shows equals after Employee class implements equals
		}
		else
		{
			System.out.println("e1, e3 not equals");
		}
		
		/*
		 * Comparing different objects with different subtypes with same properties by equals method
		 */
		if(e1==e2)
		{
			System.out.println("e1,e2 == equals");        
		}
		else
		{
			System.out.println("e1, e2 not == equals");
		}
		
		
		/*
		 * Comparing different object with same subtypes and same properties by ==
		 */
		if(e1==e3)
		{
			System.out.println("e1, e3 == equals");
		}
		else
		{
			System.out.println("e1, e3, not == equals");
		}
		
		
		/*
		 *  testing same object with equals
		 */
		if(e1.equals(e1)) 
		{
			System.out.println("equals by same object");
		}
			
	}

}
