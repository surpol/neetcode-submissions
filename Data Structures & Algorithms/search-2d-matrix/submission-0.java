class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 
        int n = matrix[0].length;
        int c = n - 1; // last column
        int r = 0;  // first row

        while (r < matrix.length && c >= 0) {
            if (target > matrix[r][c]) {
                r++;
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                return true;
            }
        }

        return false;





    }
}
