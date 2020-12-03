public class Answer_4
{
	public static void print(String message)
	{
		System.out.print(message);
	}

	public static void main(String args[]){
		int limit = Integer.MAX_VALUE;
		
		long n = 1;
		long sum = 1;
		
		while( n < limit && n > 0)
		{
			long prod = n*n;
			if( prod == sum )
			{
				print("The smallest value of 'i' possible is: " + n + "\n");
			}
			n++;
			sum+=n;
		}
	}
}