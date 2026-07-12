class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<cardPoints.length;i++){
            sum+=cardPoints[i];
        }
        int windowSize=cardPoints.length-k;
        int minimumWindowSum=Integer.MAX_VALUE;
        int sum2=0;
        for(int i=0;i<cardPoints.length;i++){
            sum2+=cardPoints[i];
            if(i==windowSize-1){
                if(sum2<minimumWindowSum){
                    minimumWindowSum=sum2;
                }
            }
            else if(i>windowSize-1){
                sum2-=cardPoints[i-windowSize];
                if(sum2<minimumWindowSum){
                    minimumWindowSum=sum2;
                }
            }
        }
        if(windowSize==0){
            return sum;
        }
        return sum-minimumWindowSum;
    }
}