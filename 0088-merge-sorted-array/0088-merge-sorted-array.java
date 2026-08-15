class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        sort(nums1,0,m+n-1);
    }
    private void sort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        mergearr(arr,low,mid,high);
    }
    private void mergearr(int[] arr,int low,int mid,int high){
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
            i++;
            left++;
        }
        while(right<=high){
            temp[i]=arr[right];
            i++;
            right++;
        }
        for(int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }
}