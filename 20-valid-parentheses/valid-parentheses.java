class Solution {
    public boolean isValid(String s) {
        if ((s.length()%2)!=0){
            return false;
        }
        char[] stack= new char[s.length()+1];
        int top=-1;
        
        
        for(int i=0;i<s.length();i++){
            if(top==-1){
                top++;
                stack[top]=s.charAt(i);
                
            }
            if(stack[top]=='('&& s.charAt(i)==')'){
                top--;
            }
            else if(stack[top]=='['&& s.charAt(i)==']'){
                top--;
            }
            else if(stack[top]=='{'&& s.charAt(i)=='}'){
                top--;
            }else{
                top++;
                stack[top]=s.charAt(i);
            }


        }
        if(top==0){
            return true;
        }else{
            return false;
        }
    }
}