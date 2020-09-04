import java.util.*;
public class Answer_3{

	public static void print(String msg)
	{
		System.out.print(msg);
	}

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		print("Enter a string containing only lettrs: \n");
		
		String s = obj.nextLine();
		char[] chars = s.toCharArray();
		

		int n = chars.length;
		char temp;
		int k, first_, second_;
		
		for(int i=0; i < n - 1; i++)
		{
			first_ = chars[i];
			k = i;
			for(int j=i+1;j<chars.length;j++)
			{
				second_ = chars[j];
				if(first_>second_)
				{
					k = j;
					first_ = second_;
				}
			}
			temp = chars[i];
			chars[i] = chars[k];
			chars[k] = temp;
		}
		
		print(chars);
	}
}