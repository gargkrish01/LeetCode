class Solution {
    public void permutation(int[] arr,List<Integer> list,List<List<Integer>> l){
        if(arr.length == list.size()){
            l.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
            permutation(arr,list,l);
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permutation(nums,list,l);
        return l;
    }
}