class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            int maxNumber=Integer.MIN_VALUE;
            int number=0;
            for(int j=i;j<nums.length;j++){
                number++;
                if(number>k){
                    break;
                }
                if(maxNumber<nums[j]){
                    maxNumber=nums[j];
                }
            }
            a1.add(maxNumber);
        }
        int []arr=new int[a1.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=a1.get(i);
        }
        return arr;
    }
}