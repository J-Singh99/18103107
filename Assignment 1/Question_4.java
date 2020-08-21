import java.util.*;
public class Question4
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    
    	System.out.print("Enter the first string : ");
        
        char str1[] = sc.next().toCharArray();
        Arrays.sort(str1);
        
        char str2[] = sc.next().toCharArray();
        Arrays.sort(str2);

        System.out.print("\n" + Arrays.equals(str1,str2)); 
        System.out.print("\n");   	
    }   
                             
}