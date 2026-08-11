class Solution {
    public String interpret(String command) {
        String str = "";
        for(int i=0;i<command.length()-1;i++){
            char ch = command.charAt(i);
            char ch1 = command.charAt(i+1);
            if(ch=='(' && ch1==')'){
                str+='o';
            }
            else if(ch=='(' || ch==')'){
                continue;
            }
            else{
                str+=ch;
            }
        }    
        if(command.charAt(command.length()-1)=='G'){
            str+='G';
        }
        return str;
    }
}