class Solution {
    public String longestCommonPrefix(String[] strs) {
        int noofarrays=strs.length;
        int small=strs[0].length();
        int smallind=0;
        for (int i=0;i<noofarrays;i++){
            if(strs[i].length()<small){
                small=strs[i].length();
                smallind=i;
            }

        }
        
        // String res="";
         for(int i=0;i<small;i++){
             char key=strs[0].charAt(i);
             
        //     int flag=0;
        //     while(flag==0){
            for(int j=0;j<noofarrays;j++){
        if (i == strs[j].length() || strs[j].charAt(i) != key) {
                    return strs[0].substring(0, i);
                }
        //         if(strs[j].charAt(i)!=key){
        //             flag=1;
                 }
        //     }}
        //     if(flag==0){
        //         res+=key;
        //     }

         }
        // return res;
        return strs[smallind];
    }
}