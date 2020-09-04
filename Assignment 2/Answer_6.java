import java.util.Scanner;
public class Answer_6{
	public static void print(String msg)
	{
		System.out.print(msg);
	}

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		print("Enter a number for the Hailstone series: ");
		long n = obj.nextInt();

		while(n <= 0)
		{
			print("This is a not valid input.\n")
			print("Please enter a positive integer: ");
			n = sc.nextInt();
		}

		print("\nThe Hailstone series for "+ n + " is:\n");


		print(n + "\n");
		int c = 0;
		while(n!=1 && c<Integer.MAX_VALUE && n<Integer.MAX_VALUE && n>0)
		{
			if(n%2!=0)
			{
				n*=3;
				n++;
			}
			else
			{
				n/=2;
			}
			print(n+"\n");
			c++;
		}

		if(n==1)
		{
			print("Number of steps: " + c + "\n");
		}
		
		else if( n<0 || n==Integer.MAX_VALUE)
		{
			print("Integer overflow reached!!!\n");
		}
		else{
			print("Number of steps maxed out!!!\n");
		}
	}
}