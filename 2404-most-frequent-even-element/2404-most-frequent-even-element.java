class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int ans=-1;
        int freq=0;
        for(int i : map.keySet()){
            if(i%2==0){
                freq=map.get(i);
                if(freq>max){
                    max=freq;
                    ans=i;
                }
                else if(freq==max && ans>i){
                    ans=i;
                }
            }
        }
        return ans;
    }
}