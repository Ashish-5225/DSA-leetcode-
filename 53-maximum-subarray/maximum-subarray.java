class Solution {
    public int maxSubArray(int[] nums) {
        int sumcurrent=0;
        int maxelem=Integer.MIN_VALUE;
        for (int val : nums){
            sumcurrent+=val;
            maxelem=Math.max(sumcurrent,maxelem);
        
        if (sumcurrent<0){
            sumcurrent=0;
        }
        }
        return maxelem;
    }
}