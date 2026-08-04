class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min;i<=max;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found=true;
                }
            }
            if(!found){
                list.add(i);
            }
        }
        return list;
    }
}