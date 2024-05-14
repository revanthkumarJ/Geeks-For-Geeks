//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int rows;
            rows = Integer.parseInt(br.readLine());

            int columns;
            columns = Integer.parseInt(br.readLine());

            int[][] heights = IntMatrix.input(br, rows, columns);

            Solution obj = new Solution();
            int res = obj.MinimumEffort(rows, columns, heights);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends




class Tuple{
    int dis,r,c;
    Tuple(int dis,int r,int c){
        this.dis=dis;
        this.r=r;
        this.c=c;
    }
}
class Solution {
    
    public static int MinimumEffort(int n,int m,int heights[][]) {
        int dis[][]=new int[n][m];
        for(int[] a:dis) Arrays.fill(a,Integer.MAX_VALUE);
        Queue<Tuple> pq=new PriorityQueue<>((x,y)->x.dis-y.dis);
        pq.add(new Tuple(0,0,0));
        dis[0][0]=0;
        int[] dr={0,1,-1,0},dc={1,0,0,-1};
        while(!pq.isEmpty()){
            Tuple t=pq.poll();
            if(t.r==n-1 && t.c==m-1) return t.dis;
            for(int i=0;i<4;i++){
                int cr=t.r+dr[i],cc=t.c+dc[i];
                if(cr>=0 && cr<n && cc>=0 && cc<m){
                    int newDis=Math.max(Math.abs(heights[t.r][t.c]-heights[cr][cc]),t.dis);
                    if(newDis<dis[cr][cc]){
                        dis[cr][cc]=newDis;
                        pq.add(new Tuple(newDis,cr,cc));
                    }
                }
            }
        }
        return 0;
    }
}



