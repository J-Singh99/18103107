import java.util.Scanner;
public class Answer_2{

	public static void print(String msg)
	{
		System.out.print(msg);
	}

	public static void main(String[] args)
	{
		Scanner object_ = new Scanner(System.in);
		print("Enter size of array: ");
		
		int n = object_.nextInt();
		int[] arr = new int[n];
		int j = 0;
		

		print("\nEnter array elements between 0 and 20: \n");
		for(int i=0; i < n; ++i)
		{
			print("\nEnter the "  + (i+1)+ " element: ");
			arr[i] = scanner.nextInt();
		}
		

		int[] freq = new int[21];
		for(int i=0;i<n;i++)
		{
			arr[i] = object_.nextInt();
			if(arr[i]<0 || arr[i]>20)
			{
				freq[0]++;
			}
			else{
				freq[arr[i]]++;
			}
		}

		
		for(int i=0;i<21;i++)
		{
			for(int k=0;k<freq[i];k++)
			{
				arr[j] = i;
				j++;
			}
		}

		print("\nThe sorted array : ");
		
		for(int i = 0; i < n; i++)
		{
			print(arr[i] + " ");
		}
	}
}
