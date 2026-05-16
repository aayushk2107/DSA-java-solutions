on 11th may i did this

public class Main{
    public static void main(String[]args){
        int []arr={7,8,9,2,3,4,5,6};
        System.out.println(minInRotatedSortedArray(arr));
    }
    static int minInRotatedSortedArray(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return nums[start];
    }
}
on 12th may i solved this

public class Main{
    public static void main(String[]args){
        int []arr={5,5,5,6,7,2,3,4};
        System.out.println(minInRotatedSortedArray(arr));
    }
    static int minInRotatedSortedArray(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]==nums[end]){
                end--;
            }
            else if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return nums[end];
    }
}
 on 13th may i did this 

public class Main{
    public static void main(String[]args){
        int []arr={1,7,9,5,3,2};
        System.out.println(mountainArray(arr,7));
    }
    static int mountainArray(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        int peak1=start;
        int start1=0;
        int end1=peak1;
        while(start1<=end1){
            int mid=start1+(end1-start1)/2;
            if(nums[mid]==target){
                return nums[mid];
            }
            else if(nums[mid]<target){
                start1=mid+1;
            }
            else{
                end1=mid-1;
            }
        }
        int start2=peak1+1;
        int end2=nums.length-1;
        while(start2<=end2){
            int mid=start2+(end2-start2)/2;
            if(nums[mid]==target){
                return nums[mid];
            }
            else if(nums[mid]<target){
                end2=mid-1;
            }
            else{
                start2=mid+1;
            }
        }
        return -1;
    }
}

on 14th may i solved this

    class Main {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(bS(arr,3));
    }
    static int bS(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
on 15th may i solved this

    public class Main{
    public static void main(String[]args){
        int []arr={5,6,7,4,3,2};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}

on 16th may i solved this
    public class Main{
    public static void main(String[]args){
        int []arr={7,8,9,1,2,3,4,5,6};
        System.out.println(rotatedSortedArray(arr,4));
    }
    static int rotatedSortedArray(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<=start){
                if(nums[start]<nums[mid] && nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[end]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
