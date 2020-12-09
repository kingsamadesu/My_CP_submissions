/*
921. Minimum Add to Make Parentheses Valid
*/


class Solution {
    public int minAddToMakeValid(String S) {
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i)==')'){
                if(a < 1){
                    b++;
                }else{
                    a--;
                }
            }else{
                a++;
            }
        }
        return Math.abs(a)+b;
    }
}

/*
Your memory usage beats 48.68 % of java submissions.
Runtime: 0 ms
Memory Usage: 37.1 MB
*/
