class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int last=nums[0];
        int count=1;
        for(int i=0;i<len;i++){
            if (nums[i]!=last){
                nums[count]=nums[i];
                count++;
                last=nums[i];
            }


        }
        return count;
    }
}