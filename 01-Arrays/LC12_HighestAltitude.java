/*Kadane Signature--At each step, decide:
do I extend what I have, or restart here
gain = [-5,1,5,0,-7];
Move step by step:

Point 1 altitude = 0 + (-5) = -5

Point 2 altitude = -5 + 1 = -4

Point 3 altitude = -4 + 5 = 1

Point 4 altitude = 1 + 0 = 1

Point 5 altitude = 1 + (-7) = -6
 The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
*/
class Solution {
    public int largestAltitude(int[] gain) {
        int maxGain=0;
        int currentGain=gain[0];
        for(int i=0;i<gain.length;i++){
            if(i==0){
                currentGain=0+gain[i];
            }
            else{
                currentGain=currentGain+gain[i];
            }
            if(currentGain>maxGain){
                maxGain=currentGain;
            }
        }
        return maxGain;
    }
}