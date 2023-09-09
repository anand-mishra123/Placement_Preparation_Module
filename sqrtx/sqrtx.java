class Solution {
    public int mySqrt(int x) {
        if(x>0&&x<4) return 1;
        int left=1,right=x/2;
        while(left<=right){
            int mid = (left+right)/2;
            if((long)mid*mid>x) right=mid-1;
            else if((long)(mid*mid)==x) return mid;
            else left=mid+1;
        }
        return right;
    }
}