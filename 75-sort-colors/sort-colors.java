class Solution {
    public void sortColors(int[] nums) {
        int zerocount=0,onecount=0,twocount=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0){
                zerocount++;

            }
            else if(nums[i]==1){
                onecount++;
            }else{
                twocount++;
            }

        }
        int i=0;
        while(zerocount>0){
            nums[i]=0;
            i++;
            zerocount--;
        }
        while(onecount>0){
            nums[i]=1;
            i++;
            onecount--;
        }
        while(twocount>0){
            nums[i]=2;
            i++;
            twocount--;
        }

    }
}