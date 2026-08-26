class Solution {
    public int mySqrt(int x) {
        int firstodd=1;
        int count=0;
        while(x>0){
            if((x-firstodd)>=0){
                x=x-firstodd;
                firstodd=firstodd+2;
                count++;
            }
            else if(x<firstodd){
                break;
            }
        }
        return count;
    }
}