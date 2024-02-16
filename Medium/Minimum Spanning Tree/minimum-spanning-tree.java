//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
	static int spanningTree(int V, int E, int edge[][]){
	    int edges[][]=new int[V][V];
	    for(int i=0;i<edge.length;i++)
	    {
	        edges[edge[i][0]][edge[i][1]]=edge[i][2];
	        edges[edge[i][1]][edge[i][0]]=edge[i][2];
	    }
	    boolean mst[]=new boolean[V];
	    int values[]=new int[V];
	    Arrays.fill(values,Integer.MAX_VALUE);
	    values[0]=0;
	    int res=0;
	    for(int count=0;count<V;count++)
	    {
	        int u=-1;
	        for(int i=0;i<V;i++)
	        {
	            if(!mst[i] && (u==-1 || values[i]<values[u]))
	            u=i;
	        }
	        mst[u]=true;
	        res=res+values[u];
	        for(int i=0;i<V;i++)
	        {
	            if(edges[u][i]!=0 && !mst[i] && values[i]>edges[u][i])
	            values[i]=edges[u][i];
	        }
	    }
	    return res;
	}
}