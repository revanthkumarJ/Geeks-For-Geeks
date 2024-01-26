//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.6f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends




/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    void merge(Item array[],int beg,int mid,int end)
{
    int i=beg,j=mid+1,ind=beg;
    ArrayList<Item>arr=new ArrayList<>();
    while((i<=mid) && (j<=end))
    {
        if(((double)array[i].value/array[i].weight)>=((double)array[j].value/array[j].weight))
            arr.add(array[i++]);
        else
            arr.add(array[j++]);
    }
    while(i<=mid)
    {
        arr.add(array[i++]);
    }
    while(j<=end)
    {
        arr.add(array[j++]);
    }
    for (int k = beg; k <= end; k++)
        array[k] = arr.get(k-beg);
}
void mergeSort(Item array[],int beg,int end)
{
    if(beg<end)
    {
        int mid=(beg+end)/2;
        mergeSort(array,beg,mid);
        mergeSort(array,mid+1,end);
        merge(array,beg,mid,end);
    }
}
    double fractionalKnapsack(int capacity, Item array[], int n) 
    {
        mergeSort(array,0,n-1);
    
    double profit=0;
    for(int i=0;i<n;i++)
    {
        if(array[i].weight<capacity)
        {
            profit=profit+array[i].value;
            capacity=capacity-array[i].weight;
        }
        else
        {
            profit=profit+capacity*((double)array[i].value/array[i].weight);
            capacity=0;
            break;
        }
    }
    return profit;
    }
}