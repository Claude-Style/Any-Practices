
public class BubbleSortMain {
	public static void main(String[] args)
	{
		int[] targetArray = {13,53,243,56,5,1423,654,43,24,13};
		
		//ц╟ещеепР sort		
		for(int n=0;n<targetArray.length;n++)
		{
			for(int m=0;m<targetArray.length-1;m++)
			{
				if(targetArray[m]<targetArray[m+1])
				{
					int temp=targetArray[m];
					targetArray[m]=targetArray[m+1];
					targetArray[m+1]=temp;
					System.out.print("step:"+n+"."+m+"  :");
					for(int x=0;x<targetArray.length;x++)
					{
						System.out.print(targetArray[x] + " ");
					}
					System.out.println();
				}
			}
		}
	}
}
