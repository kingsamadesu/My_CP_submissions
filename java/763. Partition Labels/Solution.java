/*
Runtime: 2 ms
Memory Usage: 37.4 MB
*/

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[26];
        for(int j = 0 ; j < S.length() ; j++){
            arr[S.charAt(j) - 'a'] = j;
        }
        int start = 0;
        int end = 0 ;
        char c;
        
        for(int i = 0 ; i < S.length() ; i++){
            c = S.charAt(i);
            if(arr[c  - 'a'] > end){end=arr[c - 'a'];}
            if(end == i){
                list.add(end-start+1);
                start = i+1;
                end=0; 
            }
        }
        if(end==start)list.add(end-start+1);

        return list;
    }
}

/*
memory usage beats 93.04 % of java submissions.
runtime beats 99.14 % of java submissions.
*/
