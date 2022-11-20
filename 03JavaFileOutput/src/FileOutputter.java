import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileOutputter {
	/**
	 * a class can be used to do outputs to a seperate file. use /usr/local/DynacNG... in dynac
	 * the official way is do this by configuring the Tomcat log, see wiki logging configuration
	 * 
	 * @param s one line of string for outputing 
	 */
	public static void writeFile(String s)
	{
		File file = createFile();
		BufferedWriter out;
		try {
//			out = new BufferedWriter(new FileWriter(file));
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)));
		out.write("["+getCurrentTime()+"]   "+s+"\r\n\n");
		out.flush();
		out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static File createFile()
	{
		File dir = new File("//home//cshao//Documents//testFile");
		//etc: //usr//local//DynacNG//project//current//log//
		if(!dir.exists())
		{
			dir.mkdir();
		}
		File file1 = new File(dir,"file1.txt");
		//etc:orbbServer.txt
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
		return file1;
	}
	public static int countFile()
	{
		String[] FL;
		File dir = new File("//home//cshao//Documents//testFile");
		int count = 0;
		FL = dir.list();
		for(int i=0;i<FL.length;i++)
		{
			count++;
			System.out.println(FL[i]+":is in the directory");
		}
		System.out.println("there are "+count+" files in the directory");
		return count;
	}
	public static String getCurrentTime()
	{
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd HH:mm:ss");		
		String currentTime = dateFormat.format(now);
		return currentTime;
//		Calendar c=Calendar.getInstance();
//		int month = c.get(Calendar.MONTH);
//		int date =  c.get(Calendar.DATE);
//		int hour =  c.get(Calendar.HOUR_OF_DAY);
//		int minute=  c.get(Calendar.MINUTE);
//		int second=  c.get(Calendar.SECOND);
		
		
	}
}
