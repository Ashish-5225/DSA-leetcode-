class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0)
                nums[i]=-1;
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);
        int prefixSum=0;
        for(int i=0;i<nums.length;i++) {
            prefixSum += nums[i];
            if(m.containsKey(prefixSum))
                maxLen = Math.max(maxLen,i-m.get(prefixSum));
            else
                m.put(prefixSum,i);
        }
        return maxLen;
    }
}