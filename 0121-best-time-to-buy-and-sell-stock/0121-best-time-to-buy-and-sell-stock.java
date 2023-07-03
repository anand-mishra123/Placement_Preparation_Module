class Solution {
    public int maxProfit(int[] p) {
        if(p.length==0) return 0;
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<p.length;i++){
            if(p[i]<min) min = p[i];
            else if(p[i]-min>ans)
                ans = p[i]-min;
        }  
        return ans;
    }
}