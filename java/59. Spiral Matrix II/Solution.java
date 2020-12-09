


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] M = new int[n][n];
        int count = 1;
        
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        
        while(left <= right && top <= bottom){
            for (int j = left ; j <= right ; j++){
                M[top][j] = count;
                count++;
            }
            top++;
            for (int i = top ; i <= bottom ; i++){
                M[i][right] = count;
                count++;
            }
            right--;
            for (int j = right ; j >= left ; j--){
                M[bottom][j] = count;
                count++;
            }
            bottom--;
            for (int i = bottom ; i >= top ; i--){
                M[i][left] = count;
                count++;
            }
            left++;
        }
        return M;
    }
}

/*
Your memory usage beats 46.75 % of java submissions.
Runtime: 0 ms
Memory Usage: 37.1 MB
*/
