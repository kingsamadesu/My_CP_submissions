/*
220. Contains Duplicate III
*/


class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        k = Math.min(k , nums.length);
        TreeSet<Long> set = new TreeSet();
        Long value;
        int i ;
        for (i = 0 ; i < k ; i++){
            value = set.floor((long) nums[i]);
            if(value != null && nums[i]-value<=t){
                return true;
            }
            value = set.ceiling((long) nums[i]);
            if(value != null && value-nums[i]<=t){
                return true;
            }
            set.add((long) nums[i]);
        }
        for ( i = k ; i < nums.length ; i++){
            value = set.floor((long) nums[i]);
            if(value != null && nums[i]-value<=t){
                return true;
            }
            value = set.ceiling((long) nums[i]);
            if(value != null && value-nums[i]<=t){
                return true;
            }
            set.add((long) nums[i]);
            set.remove((long) nums[i-k]);
        }
        return false;
    }   
}

/*
Runtime: 31 ms
Memory Usage: 40.7 MB
Your runtime beats 27.43 % of java submissions.
Your memory usage beats 67.83 % of java submissions.
*/
