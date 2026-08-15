class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    private void sort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i = 0;
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