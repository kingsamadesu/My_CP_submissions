/*
Your runtime beats 97.60 % of java submissions.
Your memory usage beats 88.50 % of java submissions.
*/
class Solution {
    public int minPartitions(String n) {
        int max ='0';
        for(char c : n.toCharArray()) max = Math.max(max,c); 
        return max-'0';
    }
}
/**/
