import java.util.*;

public class Question
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter word vector size : ");
    	System.out.print("\n");
    	
    	int n = sc.nextInt();

    	System.out.print("Input 'AAA' to break cycle");
    	System.out.print("Enter the words to reduce : ");
    	System.out.print("\n");
    	
    	Set<String> set = new HashSet<String>();
    	
    	for(int i = 0; i < n; i++)
    	{
    		set.add(sc.next());
    	}

    	System.out.print("Enter word 'AAA' to mark the end of paragraph.");
    	System.out.print("\n");

    	System.out.print("Enter the paragraph : ");
    	System.out.print("\n");

    	String word = sc.next();
    	StringBuffer para = new StringBuffer();

    	while(!word.equals("AAA"))
    	{
    		if(set.contains(word))
    		{
    			para.append(word.charAt(0)+"");
    			for(int i = 1;i<word.length();i++)
    			{
    				para.append("*");
    			}
    			para.append(" ");
    		}
    		
    		else
    		{
    			para.append(word + " ");
    		}
    		word = sc.next();
    	}
  
    	System.out.print("Answer : ");
    	System.out.pritn("\n");


    	System.out.print(para.toString().trim());
    	
    	System.out.print("\n");
    	
    }   
}