import java.util.*;

public class Question_1
{
	public static void print(String message)
    {
		System.out.print(message);
	}

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
        print("Enter the pattern to search: ");
    	String s2 = sc.next();
    	
        print("Enter the string to search inside of: ");
    	String s1 = sc.next();
    	
    	if(s2.length() > s1.length())
    	{
    		print("You messed up the order, didn't you?\n");
    		print("Try again....");
            return;
    	}
    	

        //converting to sort
    	char st[] = s2.toCharArray();
    	Arrays.sort(st);
    	s2 = new String(st);


    	int ans = 0;
    	int k = s2.length();
    	
    	for(int i = 0; i <= s1.length() - k; )
    	{
    		String temp = s1.substring(i, i + k);
    		
            //sorting in array form
    		st = temp.toCharArray();
    		Arrays.sort(st);
    		temp = new String(st);
    		
    		if(temp.equals(s2))
    		{
    			ans++;
    			i += k;
    		}
    		
    		else
    		{
    			i++;
    		}
    	}


    	print("The pattern is repeated " + ans + " times.");
        sc.close();
    }   
                             
}
