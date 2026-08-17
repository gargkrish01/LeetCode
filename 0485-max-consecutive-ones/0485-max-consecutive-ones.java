class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int cnt=0;
        for(int i : nums){
            if(i==1){
                cnt++;
            }
            else{
                max=Math.max(max,cnt);
                cnt=0;
            }
        }
        return Math.max(max,cnt);
    }
}