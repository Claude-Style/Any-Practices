import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public class TestURLEncoderMain {

	public static void main(String args[])
	{
		String paramValue = "172.20.146.214";
		String yourURLStr;
		try {
			yourURLStr = "http://" + java.net.URLEncoder.encode(paramValue, "UTF-8");
			java.net.URL url = new java.net.URL(yourURLStr);
			System.out.println("URL is:"+url.toString());
		} catch (UnsupportedEncodingException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
