import java.util.*;

public class Question_2
{
    public static void print(String message)
    {
        System.out.print(message);
    }

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	print("Enter the number of words to replace: ");
    	int n = sc.nextInt();

    
        print("\nEnter the words to reduce :\n");

    	Set<String> set = new HashSet<String>();
    	for(int i = 0; i < n; i++)
    	{
    		set.add(sc.next());
    	}

    	print("\nNOTE: Entering 'END' will break the cycle...");

    	print("\nNow, enter the paragraph :\n");
    	String word = sc.next();
    	StringBuffer para = new StringBuffer();

    	while(!word.equals("END"))
    	{
    		if(set.contains(word))
    		{
    			para.append(word.charAt(0));
    			
                for(int i = 1; i < word.length(); i++)
    			{
    				para.append("*");
    			}

    			para.append(" ");
    		}
    		
    		else
    		{
    			para.append(word + ' ');
    		}

    		word = sc.next();
    	}
  
    	print("The formatted text is as follows:\n");
        print(para.toString().trim());

        sc.close();
    	
    }   
}
