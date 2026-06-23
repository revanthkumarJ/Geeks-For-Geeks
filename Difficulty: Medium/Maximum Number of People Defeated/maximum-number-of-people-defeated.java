class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int curr=0;
        int sum=0;
        while(p>=0){
            curr++;
            sum = curr*curr;
            if(p>=sum){
                p-=sum;
            }
            else
            return curr-1;
        }
        return 0;
    }
};