import java.util.Scanner;
public class Answer_1{

	public static void print(String msg)
	{
		System.out.print(msg);
	}

	public static int compareString(String s1, String s2) 
	{

        for(int i = 0; i < s1.length() && i < s2.length(); ++i)
        {
            if( (int)s1.charAt(i) == (int)s2.charAt(i))
            {
                continue;
            }
            else return (int)s1.charAt(i)-(int)s2.charAt(i);
        }

        if(s1.length() < s2.length())
        {
            return s1.length() - s2.length();
        } 

        else if(s1.length()>s2.length())
        {
            return s1.length() - s2.length();
        } 
        else return 0;
    }


    
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        print("Enter the first string: ");
        String s1 = obj.next();
        
        System.out.print("\nEnter the second string: ");
        String s2 = obj.next();

        boolean equal = true;

        print(compareString(s1,s2));

    }
}

