class Solution {
    public int maxProfit(int[] prices) {
        int maxProfits=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i< prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                if(prices[i]-min>maxProfits){
                    maxProfits= prices[i]-min;
                }
            }
        }
        return maxProfits;
    }
}
