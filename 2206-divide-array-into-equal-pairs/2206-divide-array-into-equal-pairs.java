class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        int cnt=0;
        while(j<nums.length && i<nums.length){
            if(nums[i]==nums[j]){
                cnt++;
            }
            i+=2;
            j+=2;
        }
        return  nums.length==cnt*2;
    }
}