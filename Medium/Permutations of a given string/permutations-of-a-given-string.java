//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    
    HashSet<String>res;
    public void add(String S,int i)
    {
        if(i==S.length())
        {
            res.add(S);
            return;
        }
        for(int j=i;j<S.length();j++)
        {
            char [] array=S.toCharArray();
            char temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            add(new String(array),i+1);
        }
    }
    public List<String> find_permutation(String S) 
    {
        
        res=new HashSet<>();
        add(S,0);
        ArrayList<String> r=new ArrayList<>(res);
        Collections.sort(r);
        return r;
        
    }
}