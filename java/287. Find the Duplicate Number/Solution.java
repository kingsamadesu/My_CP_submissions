/*
Your runtime beats 63.21 % of java submissions.
Your memory usage beats 88.04 % of java submissions.
*/

class Solution {
    public int findDuplicate(int[] nums) {
        int[] nums2 = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++) nums2[nums[i]-1]++;
        for(int i = 0 ; i < nums.length ; i++) if(nums2[i]>1) return i+1;
        return 0;
    }
}

/*
Runtime: 1 ms
Memory Usage: 38.7 MB
*/
