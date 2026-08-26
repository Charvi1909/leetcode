class Solution {
    public boolean isPalindrome(String s) {
        String result=s.replaceAll("[^a-zA-Z0-9]","");
        int len=result.length();
        result=result.toLowerCase();
        for(int i=0;i<result.length()/2;i++){
            if(result.charAt(i)!=result.charAt(len-1)){
                return false;
            }else{
                len--;

            }
        }


        return true;
    }
}