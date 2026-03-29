// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int currSum=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            
            if(currSum==k)
            res=i+1;
            
            if(!map.containsKey(currSum)){
                map.put(currSum,i);
            }
            
            if(map.containsKey(currSum-k)){
                int index= map.get(currSum-k);
                if(res<i-index)
                res=i-index;
            }
        }
        
        return res;
    }
}
