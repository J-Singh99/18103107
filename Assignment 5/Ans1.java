class Counter extends Thread
{
    public void run()
    {   
        try
        {   
            System.out.print("Counting numbers from 1 to 100\n\n\n");
            
            for(int counter = 1; counter <= 100; counter++)
            {
                System.out.print(" " + counter + " ");
                System.out.print("......... and sleeping for 1 sec... Too... tired....\n");
                Thread.sleep(1000);
                
                if(counter%10 == 0)
                {
                    System.out.print("\n" + counter + " numbers have been printed.\n");
                    
                    if(counter==100)
                    {
                        System.out.print("All 100 numbers have been printed!\n");
                    }
                }
            }
        }

        catch(InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
                
    }
}
public class Ans1 
{
    public static void main(String[] args)
    {
	  Counter count_to_100 = new Counter();
	  count_to_100.start();
    }
}
