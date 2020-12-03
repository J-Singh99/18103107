import java.util.Scanner;
import java.util.*;
import java.lang.Math;

class Ans1
{
    public static void print(String msg)
    {
        System.out.print(msg);
    }

    public static void main(String[] args)
    {
        int n, m;
        Scanner in = new Scanner(System.in);

        print("Please enter the number of rows (n) : ")
        n = in.nextInt();

        print("Please enter the number of columns (m) : ")
        m = in.nextInt();
        in.nextLine();
        
        String[] crops = new String[n];
        
        for (int i = 0; i < n; i++)
        {
            print("\n Enter the " + i + " row of crops : ")
            crops[i]=in.next().trim();
        }


        char[][] farm = new char[n][m];        
        for(int i = 0; i < n; i++)
        {
            farm[i] = crops[i].toCharArray();
        }

        print(numReplant(farm, 0, 0, n, m));

        sc.close()
    }

    
    private static int numReplant(char[][] farm, int x, int y, int n, int m)
    {
        if(x<0 || y<0 || x >= n)
            return 0;

        for(int i = x; i < n; i++)
        {
            int j = 0;
            
            if(i == x)
            {
                j = y;
            }
            
            for( ; j < m; j++)
            {
                int left = 0;
                if(j-1>=0 && farm[i][j-1] == farm[i][j]) left = 1;
                
                int right = 0;
                if(j+1<m && farm[i][j+1] == farm[i][j]) right = 1;
                
                int top = 0;
                if(i-1>=0 && farm[i-1][j] == farm[i][j]) top = 1;
                
                int bottom = 0;
                if(i+1<n && farm[i+1][j] == farm[i][j]) bottom = 1;



                if(left==1 || right==1 || top==1 || bottom==1)
                {
                    int ans = Integer.MAX_VALUE;
                    
                    char plant = farm[i][j];
                    
                    if(left == 1)
                    {
                        farm[i][j-1] = '#';
                        ans = Math.min(ans,numReplant(farm, i, j+1, n, m));
                        farm[i][j-1] = plant;
                    }

                    if(right == 1)
                    {
                        farm[i][j+1] = '#';
                        ans = Math.min(ans,numReplant(farm, i, j+1, n, m));
                        farm[i][j+1] = plant;
                    }

                    if(top == 1)
                    {
                        farm[i-1][j] = '#';
                        ans = Math.min(ans,numReplant(farm, i, j+1, n, m));
                        farm[i-1][j] = plant;
                    }

                    if(bottom == 1)
                    {
                        farm[i+1][j] = '#';
                        ans = Math.min(ans,numReplant(farm, i, j+1, n, m));
                        farm[i+1][j] = plant;
                    }

                    farm[i][j] = '#';
                    ans = Math.min(ans, numReplant(farm, i, j+1, n, m));
                    farm[i][j] = plant;

                    return 1 + ans;
                }
            }
        }

        return 0;
    }
}