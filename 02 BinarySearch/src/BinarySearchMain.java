
public class BinarySearchMain {
	public static void main(String[] args)
	{
		int[] targetArray = {13,53,243,56,5,1423,654,43,24,13};
		int[] sortedArray = {};
		int targetValue=24;
		boolean isOdd=false;
		int halfPosition;
		
		
		//bubble sort
		for(int n=0;n<targetArray.length;n++)
		{
			for(int m=0;m<targetArray.length-1;m++)
			{
				if(targetArray[m]>targetArray[m+1])
				{
					int temp=targetArray[m];
					targetArray[m]=targetArray[m+1];
					targetArray[m+1]=temp;
				}
			}
		}
		
		
		sortedArray=targetArray;
		
		System.out.print("sorted:");
		for(int n=0;n<sortedArray.length;n++)		
		{
			System.out.print( " "+sortedArray[n]);
		}
		System.out.println();
		if(sortedArray.length%2!=0)
		{
			isOdd=true;
		}
		else
		{
			isOdd=false;
		}
		
		if(isOdd)
		{
			halfPosition=sortedArray.length/2+1;
		}
		else
		{
			halfPosition=sortedArray.length/2;
		}
		int lowest=0;
		int highest=sortedArray.length-1;
		while(sortedArray[lowest]<sortedArray[highest])
		{			
			if(sortedArray[halfPosition]==targetValue)
			{
				lowest=halfPosition;
				highest=halfPosition;
				break;
			}
			System.out.println("current target halfPosition value:"+sortedArray[halfPosition]);
			if(targetValue<sortedArray[halfPosition])
			{
				highest=halfPosition-1;
				halfPosition=highest/2;
			}
			else
			{
				lowest=halfPosition+1;
				halfPosition=halfPosition+(highest-halfPosition)/2;
			}
		}		
		System.out.println("target position is between position:"+lowest+"  "+highest);
	}
}
