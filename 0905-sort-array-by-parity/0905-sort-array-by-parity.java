class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                a[j++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                a[j++]=nums[i];
            }
        }
        return a;
        
    }
}