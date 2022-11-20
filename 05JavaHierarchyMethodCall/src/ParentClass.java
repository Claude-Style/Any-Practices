
public class ParentClass {
	public void showMessage()
	{
		System.out.println("msg from parentClass");		
	}	
	public void callMethod()
	{
		System.out.println("call method");
		showMessage();
	}
}
