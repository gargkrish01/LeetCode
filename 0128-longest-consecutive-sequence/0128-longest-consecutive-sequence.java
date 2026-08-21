class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        mergesort(nums,0,nums.length-1);
        int count=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
                count++;
                max=Math.max(count,max);
            }
            else{
                count=1;
            }
        }
        return max;
    }
    private void mergesort(int[] nums,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    private void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                left++;
            }
            else{
                temp[i]=arr[right];
                right++;
            }
            i++;
        }
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        for(int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }
}