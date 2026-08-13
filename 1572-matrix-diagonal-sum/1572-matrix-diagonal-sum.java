class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int diff=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j || i==mat.length-j-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum-diff;
    }
}