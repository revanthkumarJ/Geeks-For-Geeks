//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	    boolean negative=false;
	    int i=0;
	    if(s.charAt(0)=='-')
	    {
	        negative=true;
	        i=1;
	    }
	    int res=0;
	    for(;i<s.length();i++)
	    {
	        if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
	        return -1;
	        int r=s.charAt(i)-'0';
	        res=res*10+r;
	    }
	    if(negative)
	    return -res;
	    return res;
	    
    }
}
