
public class EvenAndOdd {
	public static void main (String []args)
	{
		
		int [] numbers={1,2,5,35,23,24,46,7,50,51};
		int pivot=numbers.length-1;
		int start=0;
		while(start<pivot)
		{
			
			if(numbers[pivot]%2==1)
				--pivot;
			else if(numbers[start]%2==0)
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
		for(int num:numbers)
			System.out.print(num+" ");
		System.out.println();
	}
}
