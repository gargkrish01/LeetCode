class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!list.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}