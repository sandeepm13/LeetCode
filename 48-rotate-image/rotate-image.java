class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int[][] arr = new int[m][m];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<m;j++){
                arr[j][(m-i)-1] = matrix[i][j];
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = arr[i][j] ;
            }
        }
        // System.out.println(Arrays.deepToString(arr));
    }
}