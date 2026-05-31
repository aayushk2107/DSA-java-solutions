class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start=1;
        int end=position[position.length-1]-position[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(maxMF(position,m,mid)){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    public boolean maxMF(int []nums,int m,int distance){
        int count=1;
        int last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=distance){
                count++;
                last=nums[i];

                if(count>=m){
                    return true;
                }
            }
        }
        return false;
    }
}