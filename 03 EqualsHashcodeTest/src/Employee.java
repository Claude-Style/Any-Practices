
public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName= lastName;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
//		System.out.println("equals??");
//		System.out.println(this.getFirstName());
//		System.out.println(((Employee)obj).getFirstName());
//		System.out.println(this.getLastName());
//		System.out.println(((Employee)obj).getLastName());
		
		if(this==obj)
		{
			System.out.println("this hash:"+this);
			System.out.println("obj hash:"+obj);
			System.out.println("Equals by same object has code");
		}
		
		
		/*
		 *  comparing the two String with the equals method and the ==, the result is same.
		 */
//		if(this.getFirstName().equals(((Employee)obj).getFirstName()) && this.getLastName().equals(((Employee)obj).getLastName()))	
		if(this.getFirstName()==((Employee)obj).getFirstName() && this.getLastName()==((Employee)obj).getLastName())
		{
			System.out.println("Employee equals");
			
			return true;
		}
		else
		{
			System.out.println("Employee not equals");
			return false;
		}
		
		
	}
	
}	
