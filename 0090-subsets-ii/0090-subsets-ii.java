class Solution {
    private void add(int[] nums,int index,List<Integer> subset,List<List<Integer>> l){
        if(index==nums.length){
            l.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        add(nums,index+1,subset,l);
        subset.remove(subset.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        add(nums,index+1,subset,l);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        add(nums,0,new ArrayList<>(),l);
        return l;
    }
}