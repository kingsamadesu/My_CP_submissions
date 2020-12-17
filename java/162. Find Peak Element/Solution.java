/*
Runtime: 0 ms
Memory Usage: 38.5 MB
*/

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==2)return nums[0] < nums[1] ? 1 : 0;
        for(int i = 1 ; i < n - 1 ; i++){
            if(nums[0]>nums[1])return 0;
            if(nums[n-1]>nums[n-2])return n-1;
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1])return i;
        }
        return 0;
    }
}

/*
memory usage beats 85.85 % of java submissions.
*/
