import java.util.*;
public class Answer_5{

    public static void print(String msg)
    {
        System.out.print(msg + "\n");
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        print("Enter the maximum limit : \n");
        int univ_max = obj.nextInt();

        print("Enter no of elements for Sets A and B: \n");
        int a = obj.nextInt()
        int b = obj.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<Integer>(), arr2 = new ArrayList<Integer>();

        print("Given elements to add in the set:\n") 
        print("Note : Anything outside universe will be replaced by 0.\n\n\n");
        ArrayList<Integer> universe = new ArrayList<Integer>();
        
        for(int i=0;i<=univ_max;i++)
        {
            print(i+" ");
            universe.add(i);
        }
        
        print("\n");

        print("Enter elements of Set A: \n");
        int temp;
        boolean present;
        for(int i=0;i<a;i++)
        {
            temp = obj.nextInt();
            
            if(temp<0 || temp>univ_max)
            {
                temp = 0;
            }
            
            present = false;
            
            for(int j=0;j<arr1.size();j++)
            {
                if(arr1.get(j)==temp)
                {
                    present = true;
                }
            }
            
            if(!present)
            {
                arr1.add(temp);
            }
        }

        print("Enter elements of Set B:\n");
        
        for(int i = 0; i < b; i++)
        {
            temp = obj.nextInt();
            if(temp<0 || temp>univ_max)
            {
                temp = 0;
            }
            present = false;
            for(int j = 0; j < arr2.size(); j++)
            {
                if(arr2.get(j) == temp)
                {
                    present = true;
                }
            }
            if(!present)
            {
                arr2.add(temp);
            }
        }

        
        print("\nUsing arrays\n");

        long startTime = System.nanoTime();
        ArrayList<Integer> union = new ArrayList<Integer>();
        
        for(int i = 0; i < arr1.size(); i++)
        {
            present = false;
            
            for(int j = 0; j < union.size(); j++)
            {
                if(arr1.get(i) == union.get(j))
                {
                    present = true;
                    break;
                }
            }
            
            if(!present)
            {
                union.add(arr1.get(i));
            }
        }


        for(int i = 0; i < arr2.size(); i++)
        {
            present = false;
            for(int j=0;j<union.size();j++){
                if(arr2.get(i)==union.get(j)){
                    present = true;
                    break;
                }
            }
            if(!present){
                union.add(arr2.get(i));
            }
        }
        print("Union of a and b: ");
        for(int i=0;i<union.size();i++){
            print(union.get(i)+" ");
        }
        print("");
        long duration = System.nanoTime() - startTime;
        print("Time for union with arrays: " + duration);

        // Intersection
        startTime = System.nanoTime();
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for(int i=0;i<arr1.size(); i++){
            present = false;
            for(int j=0;j<arr2.size();j++){
                if(arr1.get(i)==arr2.get(j)){
                    present = true;
                    break;
                }
            }
            if(present){
                intersection.add(arr1.get(i));
            }
        }
        print("\nIntersection of a and b: ");
        for(int i=0;i<intersection.size();i++){
            print(intersection.get(i)+" ");
        }
        print("");
        duration = System.nanoTime() - startTime;
        print("Time for intersection with arrays: " + duration);

        // Set Difference
        startTime = System.nanoTime();
        ArrayList<Integer> diff1 = new ArrayList<Integer>();
        for(int i=0;i<universe.size(); i++){
            present = false;
            for(int j=0;j<arr1.size();j++){
                if(arr1.get(j)==universe.get(i)){
                    present = true;
                    break;
                }
            }
            if(!present){
                diff1.add(universe.get(i));
            }
        }
        print("\nSet difference of a: ");
        for(int i=0;i<diff1.size();i++){
            print(diff1.get(i)+" ");
        }
        print("");

        ArrayList<Integer> diff2 = new ArrayList<Integer>();
        for(int i=0;i<universe.size(); i++){
            present = false;
            for(int j=0;j<arr2.size();j++){
                if(arr2.get(j)==universe.get(i)){
                    present = true;
                    break;
                }
            }
            if(!present){
                diff2.add(universe.get(i));
            }
        }
        print("Set difference of a: ");
        for(int i=0;i<diff2.size();i++){
            print(diff2.get(i)+" ");
        }
        print("");
        duration = System.nanoTime() - startTime;
        print("Time for union with arrays: " + duration);


        // Using sets
        print("\n\nUsing sets");
        Set<Integer> universe_s = new HashSet<Integer>(), s1 = new HashSet<Integer>(), s2 = new HashSet<Integer>();
        universe_s.addAll(universe);
        s1.addAll(arr1);
        s2.addAll(arr2);

        // Union
        startTime = System.nanoTime();
        Set<Integer> union_s = new HashSet<Integer>(a);
        union_s.addAll(s2);
        print("\nUnion of a and b: ");
        System.out.println(union);
        duration = System.nanoTime() - startTime;
        print("Time for union with sets: " + duration);

        // Intersection
        startTime = System.nanoTime();
        Set<Integer> intersection_s = new HashSet<Integer>(a);
        union_s.retainAll(s2);
        print("\nIntersection of a and b: ");
        print(intersection);
        duration = System.nanoTime() - startTime;
        print("Time for intersection with sets: " + duration);

        // Set Difference
        startTime = System.nanoTime();
        Set<Integer> diff1_s = new HashSet<Integer>(universe_s), diff2_s = new HashSet<Integer>(universe_s);
        diff1_s.removeAll(s1);
        print("\nSet difference of a");
        print(diff1_s);

        diff2_s.removeAll(s2);
        print("Set difference of b");
        print(diff2_s);
        duration = System.nanoTime() - startTime;
        print("Time for set difference with sets: " + duration);

        // Conclusion
        print("Time Complexity of sets < arrays");
    }
}