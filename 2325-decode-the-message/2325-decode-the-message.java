class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int cnt=0;
        for(int i=0;i<key.length();i++){
            char ch =key.charAt(i);
            if(key.charAt(i)!=' ' && !map.containsKey(ch)){
                map.put(ch,(char)('a'+cnt));
                cnt++;
            }
        }
        String str="";
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch==' '){
                str+=' ';
            }
            else{
                str+=map.get(ch);
            }
        }
        return str;
    }
}