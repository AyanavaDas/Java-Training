
public class PerfectSquareRoot {
	public static void main (String []args)
	{
		
		int [] numbers={1,2,5,35,23,16,46,7,64,51};
		int pivot=numbers.length-1;
		int start=0;
		while(start<pivot)
		{
			
			if(!isPerfectSquare(numbers[pivot]))
				--pivot;
			else if(isPerfectSquare(numbers[start]))
				++start;
			else
			{
				int t=numbers[start];
				numbers[start]=numbers[pivot];
				numbers[pivot]=t;
			}
		}
		
		
		for (int i = 0; i < pivot; i++)
			for (int j = 0; j < pivot-i; j++)
			{	
				
				if (numbers[j] < numbers[j+1])
			
	            {
	                    
					int temp = numbers[j];
	                numbers[j] = numbers[j+1];
	                numbers[j+1] = temp;
	             }
			}
		//System.out.println(numbers.length);
		for (int i = pivot+1; i < numbers.length-1; i++)
		{
			//System.out.println(i);
			for (int j = pivot+1; j < numbers.length-(i-(pivot+1))-1; j++)
			{	
				//System.out.println(i+" and "+j);
				if (numbers[j] < numbers[j+1])
			
	            {
	                   
					int temp = numbers[j];
	                numbers[j] = numbers[j+1];
	                numbers[j+1] = temp;
	             }
			}
		}
		double  sqroot[]=new double[10];
		for(int i=0;i<numbers.length;i++)
		{
			sqroot[i]=Math.sqrt(numbers[i]);
			System.out.print(sqroot[i]+" ");
		}
		System.out.println();
	}
	public static boolean isPerfectSquare(int number)
	{
		int squareRoot=(int)Math.sqrt(number);
		boolean result=((squareRoot*squareRoot)==number);
		return result;
	}
}
