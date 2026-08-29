class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum=0;
        int sum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxsum=sum;
        for(int i=0;i<k;i++){
            sum+=cardPoints[n-1-i];
            sum-=cardPoints[k-i-1];
            maxsum=Math.max(sum,maxsum);
        }

        return maxsum;
    }
}