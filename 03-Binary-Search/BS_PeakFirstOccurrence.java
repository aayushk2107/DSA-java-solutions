public class PeakFirstOccurrence {


    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end--;
            }
        }

        return start;
    }

   
    static int firstOccurrenceInPeak(int[] nums, int target) {

        int peakIndex = findPeak(nums);  

        int start = 0;
        int end = peakIndex;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 4, 4, 3, 2};
        int target = 4;

        int ans = firstOccurrenceInPeak(nums, target);

        System.out.println(ans);
    }
}
