class Counter extends Thread
    {
        public void run()
        {	
            try
            {	
                System.out.println("Counting numbers from "+1+" to "+10);
                for(int counter = 1; counter <= 100; counter++)
                {
                    System.out.print(" " + counter + " ");
                    // printing a statement after every 10 numbers
                    if(counter%10 == 0)
                    {
                        System.out.println("\n"+counter+" numbers have been printed.\n");
                        if(counter!=100){
                            System.out.println("Now, printing numbers from "+(counter+1)+" to "+(counter+10));
                        }
                    }
                    
                    // to pause for 1 second between each number
                    Thread.sleep(1000);
                }
            }
            catch(InterruptedException ie)
            {
                Thread.currentThread().interrupt();
            }
                    
        }
    }
public class Ans1 {
    public static void main(String[] args) {
		Counter count_to_100 = new Counter();
		count_to_100.start();
    }
}
