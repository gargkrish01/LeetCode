class Solution {
    public int countSegments(String s) {
                s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int space=0;
        String[] arr = s.split(" +");
        for(int i=0;i<arr.length;i++){
            space++;
        }
        return space;
    }
}