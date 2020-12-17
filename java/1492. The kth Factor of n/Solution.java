/*
Runtime: 0 ms
Memory Usage: 35.6 MB
*/

class Solution {
    public int kthFactor(int n, int k) {
        int l = 0;
        for (int i = 1 ; i <= n ; i++){
            if(n%i==0){
                l++;
                if(k==l){
                    return i;
                }
            }
        }
        return -1 ;
    }
}

/*
memory usage beats 79.36 % of java submissions.
*/
