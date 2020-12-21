/*
Your runtime beats 100.00 % of java submissions.
Your memory usage beats 90.09 % of java submissions.
*/

class Solution {
    public String alphabetBoardPath(String target) {
        int c;
        int col = 0,row = 0;
        int colDis,rowDis;
        char horzontal, vertivcal;
        StringBuilder s = new StringBuilder();
                
        for(int i = 0 ; i < target.length() ; i++){
            c = target.charAt(i) - 'a';
            rowDis = c/5;
            colDis = c%5;
            if(rowDis - row < 0) vertivcal = 'U';
            else vertivcal = 'D';
            if(colDis - col < 0) horzontal = 'L';
            else horzontal = 'R';
            for(int j = 0 ; j < Math.abs(colDis -col); j++) s.append(horzontal);
            for(int j = 0 ; j < Math.abs(rowDis - row) ; j++) s.append(vertivcal);
            s.append('!');
            if(i!=target.length()-1&&c=='z' - 'a'&&'z'!=target.charAt(i+1)){
                s.append('U');
                rowDis--;
            }
            col = colDis;
            row = rowDis;
        }
        return s.toString();
    }
}

/*
Runtime: 0 ms
Memory Usage: 36.9 MB
*/
