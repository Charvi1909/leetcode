class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==1){
            return 0;
        }
        int n= prices.length -1;
        //int[] profitsarray= new int[n*(n+1)/2 ];
        //int k=0;
//         int max=0;
//         for (int i=0;i<prices.length;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if((prices[j]-prices[i])>max){
// max=prices[j]-prices[i];
//                 }
//                 //k++;
//             }
//         }
        
        // for(int i=0;i<profitsarray.length;i++){
        //     if(profitsarray[i]>max){
        //         max=profitsarray[i];
        //     }
        // }
// if (max>0){
//     return max;
// }else{
//     return 0;
// }
int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if we find a lower one
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Otherwise, check if the current profit is greater than maxProfit
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
//return max;
    }
}