
public class Main {
	public static void main(String args[])
	{
		ParentClass pc = new ParentClass();
		pc.showMessage();
		
		ParentClass pc2 = new ChildClass();
		pc2.showMessage();
		pc.callMethod();
		System.out.println("========================================");
		pc2.callMethod();
	}
}
