import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main{
	public static void main(String[] args)
	{

		
		Predicate<Integer> isOdd = n-> n%2!=0;
		System.out.println("isOdd:"+isOdd);
		
		BinaryOperator<Integer> sum=(x,y)-> x+y;
		System.out.println("sum="+sum);
	}
}
