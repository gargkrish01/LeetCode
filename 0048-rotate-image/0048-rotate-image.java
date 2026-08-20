class Solution {
    public void rotate(int[][] matrix) {
        for(int j=0;j<matrix[0].length;j++){
            int top=0;
            int bottom=matrix[0].length-1;
            while(top<=bottom){
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}