class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=grumpy.length;
        int base=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                base+=customers[i];
            }
        }
        int sum=0;

        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }
        }
        int maxsum=sum;
        for(int i=minutes;i<n;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }
            if(grumpy[i-minutes]==1){
                sum-=customers[i-minutes];
            }
            maxsum=Math.max(sum,maxsum);

        }
        return base+maxsum;
    }
}