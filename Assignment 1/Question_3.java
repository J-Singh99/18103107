import java.util.*;

public class Question
{
	static class Edge
	{
		int src, dest, cost;
		
		Edge(int s, int d, int c)
		{
			src = s;
			cost = c;
			dest = d;
		}
	}


	public static String WAP(ArrayList<Edge> edges, int n, int src, int dest)
	{
		int m = edges.size();
		int dist[] = new int[n];
		
		Arrays.fill(dist,Integer.MAX_VALUE);
		
		dist[src] = 0;
		
		for(int i = 1;i<n;i++)
		{
			for(Edge edge:edges)
			{
				int u = edge.src;
				int v = edge.dest;
				int w = edge.cost;

				if((dist[v] > (dist[u] + w)) && (dist[u]!=Integer.MAX_VALUE))
				{
					dist[v] = dist[u]+w;
				}
			}
		}

		for(Edge edge:edges)
		{
			int u = edge.src;
			int v = edge.dest;
			int w = edge.cost;

			if(((dist[u] + w) < dist[v]) && (dist[u] != Integer.MAX_VALUE))
			{
				return "Negative cycles exist";
			}
		}
		return dist[dest]==Integer.MAX_VALUE?"No path":String.valueOf(dist[dest]);
	}


    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the number of vertices : ");
    	System.out.print("\n");
    	int n = sc.nextInt();

    	System.out.print("Enter the number of edges : ");
		System.out.print("\n");
    	int m = sc.nextInt();

    	ArrayList<Edge> edges = new ArrayList<Edge>(m);

    	System.out.print("Enter the edges in the format : ");
    	System.out.print("\n");
    	System.out.print("Source Destination Cost")
    	System.out.print("\n");

    	for(int i = 0; i < m; i++)
    	{
    		edges.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    	}
    	
    	System.out.print("Enter source : ");
    	System.out.print("\n");
    	int src = sc.nextInt();
    	
    	System.out.print("Enter destination : ");
    	System.out.print("\n");
    	int dest = sc.nextInt();

    	System.out.print(WAP(edges,n,src,dest));
    	System.out.print("\n");
    }   
                             
}