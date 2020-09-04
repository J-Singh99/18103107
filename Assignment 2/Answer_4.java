public class Answer_4
{
	public static void print(String msg)
	{
		System.out.print(msg);
	}

	public static void main(String[] args)
	{
		int n=1;
		int sum = 1;
		
		while(n<Integer.MAX_VALUE)
		{
			if(sum == n*n)
			{
				print("Ans: " + n + "\n");
			}
			n++;
			sum+=n;
		}
		print("Final sum: " + sum + "\tn: " + n);
	}
}