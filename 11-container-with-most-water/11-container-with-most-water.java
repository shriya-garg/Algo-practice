class Solution {
    public int maxArea(int[] height) {
        if(height.length<2){
            return 0;
        }
        int l = 0;
        int r = height.length-1;
        int lx=0,rx=0,max = 0;
        int temp=0;
        while(l<r){
            if(height[l]<height[r]){
                temp = height[l];
                if ((r-l)*temp>(rx-lx)*max){
                    max = temp;
                    lx = l;
                    rx = r;
                }
                l++;
            }else{
                temp = height[r];
                if ((r-l)*temp>(rx-lx)*max){
                    max = temp;
                    lx = l;
                    rx = r;
                }
                r--;
            }
        }
        // System.out.println(lx);
        // System.out.println(rx);
        // System.out.println(max);
        return (rx-lx)*max;
            
    }
}