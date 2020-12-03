import java.util.*;
public class Answer_1
{
    public static void print(String msg)
    {
        System.out.print(msg);
    }

    public static int findOrder(String first, String second)
    {
        int n1 = first.length();
        int n2 = second.length();
       
        int k = 0;
        while(k < n1 && k < n2)
        {
            char c1 = first.charAt(k);
            char c2 = second.charAt(k); 
           
            if(c1 != c2)
            {
                return c1-c2;
            }
           
            k++;
        }
        return n1-n2;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        print("Enter the first string: ");
        String first = sc.nextLine();
        
        print("Enter second string: ");
        String second = sc.nextLine();
        
        print("The lexicographical order of these two is: \n");
        
        if(findOrder(first, second) < 0)
        {
            print(first + " AND THEN " + second);
        }
        
        else
        {
            print(second + " AND THEN " + first);
        }
        
        print("\n");
        sc.close();
    }   
                             
}