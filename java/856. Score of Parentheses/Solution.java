/*
Runtime: 0 ms
Memory Usage: 36.7 MB
*/

class Solution {
    public int scoreOfParentheses(String S) {
        int sum = 0 ; 
        int indexStart = 0;
        int a = 0;
        for (int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i)=='('){
                a++;
            }else{
                a--;
            }
            if(a==0){
                if(i - indexStart == 1){
                    sum += 1;
                }else{
                    sum += 2*scoreOfParentheses(S.substring(indexStart+1,i));
                }
                indexStart=i+1;
            }
        }
        return sum;
    }
}

/*
runtime beats 100.00 % of java submissions.
memory usage beats 92.05 % of java submissions.
*/
