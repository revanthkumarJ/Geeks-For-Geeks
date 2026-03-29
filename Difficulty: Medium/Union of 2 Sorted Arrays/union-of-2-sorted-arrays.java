class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res= new ArrayList<>();
        
        int i=0;
        int j=0;
        int m= a.length;
        int n= b.length;
        
        while(i<m && j<n){
            int ele =-1;
            if(a[i]<b[j]){
                ele = a[i];
                i++;
            }
            else if(a[i]>b[j]){
                ele = b[j];
                j++;
            }
            else{
                ele= a[i];
                i++;
                j++;
            }
            if(res.size()>0){
                if(res.get(res.size()-1)!=ele)
                res.add(ele);
            }
            else{
                res.add(ele);
            }
        }
        
        while(i<m){
            int ele = a[i];
            if(res.size()>0){
                if(res.get(res.size()-1)!=ele)
                res.add(ele);
            }
            else{
                res.add(ele);
            }
            i++;
        }
        while(j<n){
            int ele = b[j];
            if(res.size()>0){
                if(res.get(res.size()-1)!=ele)
                res.add(ele);
            }
            else{
                res.add(ele);
            }
            j++;
        }
        
        return res;
    }
}
