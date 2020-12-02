import java.util.*;

public class Question_4
{
    public static void print(String message)
    {
        System.out.print(message);
    }

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    
    	print("Enter the first string : ");
        char str1[] = sc.next().toCharArray();
        Arrays.sort(str1);
        
        print("Enter the second string : ");
        char str2[] = sc.next().toCharArray();
        Arrays.sort(str2);

        if(Arrays.equals(str1,str2))
        {
            print("\nYes, these strings are anagrams of each other! :)\n");
        }
        else
        {
            print("Nope... Unfortunately, these ain't anagrams of each other! :(\n");
        }  	

        sc.close(); 
    }   
                             
}
