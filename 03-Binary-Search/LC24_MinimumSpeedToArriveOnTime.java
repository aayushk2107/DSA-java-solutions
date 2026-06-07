class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        if(hour <= dist.length - 1){
            return -1;
        }

        int start = 1;
        int end = 10000000;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(canReach(dist, hour, mid)){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public boolean canReach(int[] nums, double hour, int speed){

        double time = 0;

        for(int i = 0; i < nums.length - 1; i++){
            time=time+ Math.ceil((double) nums[i] / speed);
        }

        time= time+(double) nums[nums.length - 1] / speed;

        return time <= hour;
    }
}