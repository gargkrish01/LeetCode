class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        str=str.toLowerCase();
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}