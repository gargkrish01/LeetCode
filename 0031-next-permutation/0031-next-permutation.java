class Solution {
    public void nextPermutation(int[] nums) {
        int i1=-1;
        int i2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                i1=i;
                break;
            }
        }
        if(i1==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>i1;i--){
            if(nums[i]>nums[i1]){
                i2=i;
                break;
            }
        }
        swap(nums,i1,i2);
        reverse(nums,i1+1,nums.length-1);
    }
    private void swap(int[] nums,int i1,int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}