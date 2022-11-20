import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.UUID;

public class Main {
	public static void main(String[] args)
	{
		Map<Long,UUID> tempMap = new TreeMap<Long,UUID>();
		Date now = new Date();
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();
		UUID uuid3 = UUID.randomUUID();
		UUID uuid4 = UUID.randomUUID();
		System.out.println("uuid1:"+uuid1);
		System.out.println("uuid2:"+uuid2);
		System.out.println("uuid3:"+uuid3);
		System.out.println("uuid4:"+uuid4);
		tempMap.put(now.getTime(),uuid1 );
		
		tempMap.put(now.getTime()+15240, uuid2);
		tempMap.put(now.getTime()+242, uuid3);
		tempMap.put(now.getTime()-131300, uuid4);
		System.out.println("===================================================================================================");
		long tempLastKey=0;
		for(Entry<Long, UUID> entry:tempMap.entrySet())
		{
			System.out.println("key:"+entry.getKey()+"   value:"+entry.getValue());
			if(entry.getKey()>tempLastKey)
			{
				tempLastKey=entry.getKey();
			}
		}
		
		
		System.out.println("the last element is :"+tempLastKey+" "+"value:"+tempMap.get(tempLastKey));
	}
}
