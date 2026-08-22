class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int x=n;
        while(x>0){
            int rem = x%10;
            sum+=rem;
            x/=10;
        }
        int pro=1;
        int y=n;
        while(y>0){
            int r = y%10;
            pro*=r;
            y/=10;
        }
        return n%(sum+pro)==0;
    }
}