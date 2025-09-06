class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       for (int val : nums){
        int freq=0;
        for (int elem:nums){
        if (elem==val){
            freq++;
        }
        }
        if (freq > n/2){
            return val;
        }

       }
       return -1;
    }
}