import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMain {
	public static void main(String[] args)
	{
//		String emailAddress = "fdjask.fds@fdsafsd.ffds";
//		Pattern p = Pattern.compile("[\\w[,-]][\\w[.-]][@][\\\\w[,-]][\\\\w[.-]]");
		String emailAddress = "fdjaskj.fdsafsd@fdasf.com";
		Pattern p = Pattern.compile("[\\w[.-]]+[@][\\w[.-]]+\\.[\\w[.-]]+");
		Matcher matcher = p.matcher(emailAddress);
		System.out.println("email matches?:"+matcher.matches());    //matches ÊÇÆ¥ÅäÕû¸ö×Ö·û´®
		
		p=Pattern.compile("[\\w[.-]]+");
		matcher = p.matcher(emailAddress);
		System.out.println("test:"+matcher.find());
		System.out.println("test:"+matcher.find());
		System.out.println("test:"+matcher.find());
		System.out.println("test:"+matcher.find());
		matcher.reset();
		System.out.println("=========reset=========");
		System.out.println("test:"+matcher.find());
		System.out.println("test:"+matcher.find());
		System.out.println("test:"+matcher.find());
		System.out.println("test:"+matcher.find());
		
		
	}
}
