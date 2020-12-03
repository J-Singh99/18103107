import java.util.*;

public class Answer_5
{
    public static void print(String message)
    {
        System.out.print(message);
    }

    private static void union_array(int[] universe, int[] a, int[] b, int totalUnivSize)
    {
        int[] ans = new int[totalUnivSize];
        for(int i=0; i<totalUnivSize; i++)
        {
            if(a[i] == 1 || b[i] == 1)
                ans[i] = 1;
        }
        /*
        print("\nUnion of the sets using arrays: ");
        for(int i=0; i<totalUnivSize; i++)
        {
            if(ans[i] == 1)
                print(i + " ");
        }
        */
    }

    private static void intersection_array(int[] universe, int[] a, int[] b, int totalUnivSize)
    {
        int[] ans = new int[totalUnivSize];
        for(int i=0; i<totalUnivSize; i++)
        {
            if(a[i] == 1 && b[i] == 1)
                ans[i] = 1;
        }
        /*
        print("Intersection of the sets using arrays: ");
        for(int i=0; i<totalUnivSize; i++)
        {
            if(ans[i] == 1)
                print(i + " ");
        }
        */
    }

    private static void complement_array(int[] universe, int[] a, int totalUnivSize)
    {
        int[] ans = new int[totalUnivSize];
        for(int i=0; i<totalUnivSize; i++)
        {
            if(a[i] == 0)
                ans[i] = 1;
        }
        /*
        print("Complement of the set using arrays: ");
        for(int i=0; i<totalUnivSize; i++)
        {
            if(ans[i] == 1)
                print(i + " ");
        }
        */
    }

    public static void main(String[] args)
    {
        int totalUnivSize = 11;
        int[] universe = new int[totalUnivSize];
        
        for(int i = 0; i < totalUnivSize; i++)
        {
            universe[i] = 1;
        }

        Set<Integer> universeSet = new HashSet<Integer>();
        for(int i = 0; i < totalUnivSize; i++)
        {
            universeSet.add(i);
        }
         

        Scanner sc = new Scanner(System.in);

        print("Enter the size of set A: ");
        int m = sc.nextInt();
        int[] a = new int[totalUnivSize];
        
        Set<Integer> set_a = new HashSet<Integer>();
        print("Enter the elements of set A: \n");
       
        for(int i = 0; i < m; i++)
        {
            int num = sc.nextInt();
            a[num] = 1;
            set_a.add(num);
        }

        print("\nEnter the size of set B: ");
        int n = sc.nextInt();
        int[] b = new int[totalUnivSize];

        Set<Integer> set_b = new HashSet<Integer>();
        print("Enter the elements of set B: \n");
       
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            b[num] = 1;
            set_b.add(num);
        }

        //Union using array
        long startTime = System.nanoTime();
        union_array(universe, a, b, totalUnivSize);
        long stopTime = System.nanoTime();
        long timeElapsed1 = (stopTime - startTime)/1000;

        //Union using set
        Set<Integer> union = new HashSet<Integer>(set_a);
        startTime = System.nanoTime();
        union.addAll(set_b);
        stopTime = System.nanoTime();
        print("\nUnion of the sets is: " + union);
        long timeElapsed2 = (stopTime - startTime)/1000;

        print("\nThe time taken for union using Arrays is: " + timeElapsed1 + " ms");
        print("\nThe time taken for union using Sets is: " + timeElapsed2 + " ms");
        print("\n***\n\n\n");



        //Intersection using arrays
        startTime = System.nanoTime();
        intersection_array(universe, a, b, totalUnivSize);
        stopTime = System.nanoTime();
        timeElapsed1 = (stopTime - startTime)/1000;

        //Intersection using set
        startTime = System.nanoTime();
        Set<Integer> intersection = new HashSet<Integer>(set_a);
        intersection.retainAll(set_b);
        stopTime = System.nanoTime();
        print("Intersection of the sets is : " + intersection);
        timeElapsed2 = (stopTime - startTime)/1000;

        //Printing the time
        print("\nThe time taken for intersection using Arrays is: " + timeElapsed1 + " ms");
        print("\nThe time taken for intersection using Sets is: " + timeElapsed2 + " ms");
        print("\n***\n\n");



        //Complement using array
        startTime = System.nanoTime();
        complement_array(universe, a, totalUnivSize);stopTime = System.nanoTime();
        timeElapsed1 = (stopTime - startTime)/1000;

        //Complement using set
        startTime = System.nanoTime();
        Set<Integer> compliment = new HashSet<Integer>(universeSet);
        compliment.removeAll(set_a);
        stopTime = System.nanoTime();
        print("Complement of the set is : " + compliment);
        timeElapsed2 = (stopTime - startTime)/1000;

        //Printing the time
        print("\nThe time taken for complement using Arrays is: " + timeElapsed1 + " ms");
        print("\nThe time taken for complement using Sets is: " + timeElapsed2 + " ms");
        print("\n***\n\n");

        print("CONCLUSION: Arrays are surprisingly more efficient!!\n");

        sc.close();
    }
}