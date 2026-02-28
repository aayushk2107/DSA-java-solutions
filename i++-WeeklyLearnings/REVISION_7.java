//revised ceiling question
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,5,7,11};
        int ans=ceiling(arr,5);
        System.out.println(ans);
    }
    static int ceiling(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}

//Editing cause attempted kadane on a self generaed array and got a little tweaky answer on 28/02/2026

    public class Main{
    public static void main(String[]args){
        int []arr={10,20,15,16,17,22};
        int ans=kadane(arr);
        System.out.println(ans);
    }
    static int kadane(int []nums){
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentsum+nums[i]>nums[i]){
                currentsum=currentsum+nums[i];
            }
            else{
                currentsum=nums[i];
            }
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
        }
        return maxsum;
    }
}
