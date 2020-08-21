import java.util.*;

public class Question
{
	public static void print(String msg)
    {
		System.out.print(msg);
	}

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
    	String s1 = sc.next();
    	
    	String s2 = sc.next();
    	
    	if(s2.length() > s1.length())
    	{
    		print("0");
    		print("\n");
    		return;
    	}
    	
    	char st[] = s2.toCharArray();
    	
    	Arrays.sort(st);
    	
    	st2 = new String(st);

    	int ans = 0;
    	int k = s2.length();
    	
    	
    	for(int i = 0; i<=s1.length() - k; )
    	{
    		String temp = s1.substring(i, i + k);
    		
    		st = temp.toCharArray();
    		Arrays.sort(st);
    		
    		temp = new String(st);
    		
    		if(temp.equals(s2))
    		{
    			ans++;
    			i+=k;
    		}
    		
    		else
    		{
    			i++;
    		}
    	}

    	print("Answer : " + ans);
    	print("\n");
    }   
                             
}