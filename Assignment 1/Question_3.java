import java.util.*;

public class Question_3
{
	public static void print(String message)
	{
		System.out.print(message);
	}

	static class Edge
	{
		int src;
		int dest;
		int cost;
		
		Edge(int s, int d, int c)
		{
			this.src = s;
			this.dest = d;
			this.cost = c;
		}
	}

	public static String findSPath(ArrayList<Edge> edges, int v, int src, int dest)
	{
		int dist[] = new int[v];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[src] = 0;
		
		for(int i = 0; i < v-1; i++)
		{
			for(Edge edge:edges)
			{
				int s = edge.src;
				int d = edge.dest;
				int c = edge.cost;
				
				if( dist[s]!=Integer.MAX_VALUE && dist[d] > (dist[s] + c) )
				{
					dist[d] = dist[s] + c;
				}
			}
		}

		for(Edge edge:edges)
		{
			int s = edge.src;
			int d = edge.dest;
			int c = edge.cost;

			if( dist[s] != Integer.MAX_VALUE && dist[d] > (dist[s] + c) )
			{
				return "THERE IS A NEGATIVE CYCLE HERE!!!!";
			}
		}
		return dist[dest] == Integer.MAX_VALUE ? "No path to destination found..." : String.valueOf(dist[dest]);
	}

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
    	print("How many vertices are in the graph?\n");
    	int num_v = sc.nextInt();
    	
    	print("And, how many edges are in the graph?\n");
    	int num_e = sc.nextInt();
    	
    	ArrayList<Edge> edge_list = new ArrayList<Edge>(num_e);
    	
    	print("The edges should now be entered...");
    	print("\nNOTE: Please follow the format of:");
    	print("\n\tSource Destination Cost");
    	print("\n\nEnter the edges:\n");

    	for(int i = 0; i < num_e; i++)
    	{
    		edge_list.add( new Edge( sc.nextInt(), sc.nextInt(), sc.nextInt() ) );
    	}
    	
    	print("Enter the start vertex:");
    	int src = sc.nextInt();
    	
    	print("Enter the destination vertex:");
    	int dest = sc.nextInt();
    	
    	print(findSPath(edge_list, num_v, src, dest));
    	print('\n')
    	
    	sc.close();
    }   
                             
}