class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int elem : nums ){
            ans=ans^elem;
        }
        return ans;
    }
}