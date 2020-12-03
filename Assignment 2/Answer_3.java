import java.util.*;
public class Answer_3
{
	public static void print(String msg)
	{
		System.out.print(msg);
	}

    public static String StringSorter(String sortThis)
    {	//Bubble Sort
        char tempUnsorted[] =  sortThis.toCharArray();
        
        for(int i = 0; i < tempUnsorted.length; i++)
        {
            for(int j = i + 1; j < tempUnsorted.length; j++)
            {
                if( (int)tempUnsorted[i] > (int)tempUnsorted[j] )
                {
                    char c = tempUnsorted[i];
                    tempUnsorted[i] = tempUnsorted[j];
                    tempUnsorted[j] = c;
                }
            }
        }

        String ans = "";
        for (int i = 0; i < tempUnsorted.length; i++)
        {
            ans += tempUnsorted[i];
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string you want to sort");
        String s1 = sc.nextLine();
        
        String sortedString = StringSorter(s1);
        print("The sorted string is: " + sortedString + "\n");
        
        sc.close();
    }
}