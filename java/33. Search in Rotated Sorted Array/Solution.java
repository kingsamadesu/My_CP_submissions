/*
33. Search in Rotated Sorted Array

*/

class Solution {
    public int search(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            if(!set.add(nums[i]))return i;
        }
        return -1;
    }
}


/*
Your memory usage beats 21.92 % of java submissions.
Your runtime beats 100.00 % of java submissions.
Runtime: 0 ms
Memory Usage: 38.7 MB
*/
