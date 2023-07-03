class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0,max=Integer.MIN_VALUE;
        for(int i:nums){
            cur+=i;
            if(cur>max) max = cur;
            if(cur<0) cur=0;
        }
        return max;
    }
}