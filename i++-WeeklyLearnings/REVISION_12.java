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

on 17th may i solved this 

    public class Main{
    public static void main(String[]args){
        int []arr={3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(infiniteSortedArray(arr,140));
    }
    static int infiniteSortedArray(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=1;
        while(nums[end]<target){
            int temp=end+1;
            end=start+(end-start)+1;
            start=temp;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return nums[mid];
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
on 18th may i solved this

    public class Main{
    public static void  main(String[]args){
        int []arr={44,66,77,11,22,33};
        System.out.println(minInRSA(arr));
    }
    static int minInRSA(int []nums){
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
on 19th may i solved this

    import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int [][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][]ans=reverseArray(arr);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] reverseArray(int [][]nums){
        for(int i=0;i<nums.length;i++){
            int start=0;
            int end=nums[i].length-1;
            while(start<end){
                int temp=nums[i][start];
                nums[i][start]=nums[i][end];
                nums[i][end]=temp;
                start++;
                end--;
            }
        }
        return nums;
    }
}

on 20th may i solved this
    
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        int []ans=reverse(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] reverse(int []nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
        return nums;
    }
}

on 21st may i solved this got little problems

    public class Main{
    public static void main(String[]args){
        int []arr={-4,-3,-2,-1,0,1,2,3,4};
        System.out.println(ans(arr));
    }
    static int ans(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<0){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
on 22nd may i did this

    public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,56,71};
        System.out.println(numbersCounting(arr));
    }
    static int numbersCounting(int []nums){
        if(nums.length==0){
            return -1;
        }
        int evencount=0;
        for(int i=0;i<nums.length;i++){
            int digitcount=0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                digitcount++;
            }
            if(digitcount%2==0){
                evencount++;
            }
        }
        return evencount;
    }
}
