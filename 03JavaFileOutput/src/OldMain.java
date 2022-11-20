import java.io.File;
import java.io.IOException;

public class OldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("//home//cshao//Documents//testFile");
		File file1 = new File(dir,"file2.txt");
		if(!dir.exists())
		{
			dir.mkdir();
		}
		if(!file1.exists())
		{
			try
			{
				file1.createNewFile();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		String[] FL;
		int count = 0;
		FL = dir.list();
		for(int i=0;i<FL.length;i++)
		{
			count++;
			System.out.println(FL[i]+":is in the directory");
		}
		System.out.println("there are "+count+" files in the directory");
		
	}

}
