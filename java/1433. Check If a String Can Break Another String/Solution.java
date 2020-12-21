/*
Your runtime beats 91.60 % of java submissions.
Your memory usage beats 18.57 % of java submissions.
*/

class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] list1 = s1.toCharArray();
        char[] list2 = s2.toCharArray();
        Arrays.sort(list1);
        Arrays.sort(list2);
        boolean bool = true ;
        int j ;
        for(j = 0 ; j < list1.length ; j++){
            if(list1[j]!=list2[j]){
                bool = (list1[j]<list2[j]);
                break;
            }
        }
        for(int i = j+1 ; i < list1.length ; i++){
            if((list1[i]!=list2[i])&&(list1[i]<list2[i])!=bool) return false;
        }
        return true;
    }
}

/*
Runtime: 7 ms
Memory Usage: 40.5 MB
*/
