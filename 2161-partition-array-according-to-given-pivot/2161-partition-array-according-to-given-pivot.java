class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                list1.add(nums[i]);
            }
            else if(nums[i]>pivot){
                list2.add(nums[i]);
            }
            else{
                list3.add(nums[i]);
            }
        }
        int[] arr = new int[nums.length];
        int a =0;
        for(Integer i : list1){
            arr[a]=i;
            a++;
        }
        for(Integer i : list3){
            arr[a]=i;
            a++;
        }
        for(Integer i : list2){
            arr[a]=i;
            a++;
        }
        return arr;
    }
}