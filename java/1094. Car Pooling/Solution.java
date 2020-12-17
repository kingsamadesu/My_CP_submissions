/*
Runtime: 1 ms
Memory Usage: 39.1 MB
*/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int CapaVar=0;
        int[] arrayCa = new int[1001];
        int[] tri;
        for(int i = 0 ; i < trips.length ; i++){
            tri = trips[i];
            arrayCa[tri[1]]+=tri[0];arrayCa[tri[2]]-=tri[0];
        }
        for(int j : arrayCa){
            CapaVar += j;
            if(CapaVar > capacity) return false;
        }
        return true;
    }
}

/*
runtime beats 97.38 % of java submissions.
Your memory usage beats 31.00 % of java submissions.
*/
