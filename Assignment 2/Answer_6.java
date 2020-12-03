import java.util.*;
public class Answer_6
{
	public static void print(String message)
	{
		System.out.print(message);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		print("Enter the number whose Hailstone Sequence you want : ");
		int n = sc.nextInt();
		
		if(n >= Integer.MAX_VALUE || n < 1)
		{
         	print("Please input a valid positive number!!!\n");
         	System.exit(0);
        }

		print("The HailStone Sequence is :\n");
		
		System.out.print(n+" ");
		while(n!=1)
		{
	        if(n%2==0)
	        {
	            n/=2;
	        }

	        else
	        {
	            n*=3;
	            n++;
	        }
	        print(n+" ");
   		}
		
		print(n+"\n");
		sc.close();
	}   
                             
}