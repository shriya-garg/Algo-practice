class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //Two pointers and sliding window
        int curr= 0;
        int max = 0;
        
        // populate sum of first k elements as curr and max
        // [1,2,3,(4,5,6,1)]  - 1st window ()-> non window part

        for(int i=0; i<k; i++){
            curr += cardPoints[i];
        }
        // update max with curr best value
        max = curr;
        
        int j=cardPoints.length -1;
        // Now slide the wondow to  get best curr
        // [1,2,(3,4,5,6),1]  - 2nd window
        // [1,(2,3,4,5),6,1]  - 3rd window
        for(int i=k-1; i>=0; i--){
            curr = curr - cardPoints[i] + cardPoints[j];
            j--;
            max = Math.max(curr, max);
        }
        return max;
        
    }
}