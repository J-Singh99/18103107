import java.util.*;
public class Answer_2
{
	public static void print(String msg)
	{
		System.out.print(msg);
	}

	public static void countSort(int arr[])
	{
		int counts[] = new int[21]; //0-20
		
		for(int x:arr)
		{
			counts[x]++;
		}

		int k = 0;
		int i = 0;
		while(k < 21 && i < arr.length)
		{
			if(counts[k] < 1)
			{
				k++;
			}
			else
			{
				arr[i++] = k;
				counts[k]--;
			}
		}
	}


    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
    	print("Enter the array size: ");
		int n = sc.nextInt();
		
		print("Enter the elements (between 1 to 20):\n");
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			if( arr[i] > 20 || arr[i] < 0 )
			{
				print("PLEASE FOLLOW THE INPUT RANGE SPECIFIED!!!\n");
				System.exit(0);
			}
		}
		
		countSort(arr);
		
		print("The sorted array:\n" + Arrays.toString(arr) + "\n");

		sc.close();
    }   
                             
}