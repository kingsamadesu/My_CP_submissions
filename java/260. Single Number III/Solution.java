/*
Runtime: 1 ms
Memory Usage: 38.8 MB
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[]{0,0};
        int xor = 0;
        for (int i : nums) xor ^=i;
        xor &= -xor;
        for(int i : nums){
            if((i & xor) == 0) res[0] ^= i;
            else res[1] ^=i; 
        }
        return res;
    }
}

/*
runtime beats 96.60 % of java submissions.
memory usage beats 93.91 % of java submissions.
*/
