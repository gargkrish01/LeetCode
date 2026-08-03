class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum = digitSum(n);
        int ssum = squareSum(n);
        int diff = ssum - dsum;
        if(diff >= 50){
            return true;
        }
        return false;
    }
    private int digitSum(int n){
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    private int squareSum(int n){
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}