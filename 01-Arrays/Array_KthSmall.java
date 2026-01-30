/*Kth distinct smallest element*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 9, 3};
        int k = 3;

        int ans = kthDistinctSmallest(arr, k);
        System.out.println(ans);
    }

    static int kthDistinctSmallest(int[] nums, int k) {
        if (nums.length == 0 || k > nums.length) {
            return -1;
        }

        int kthsmall = Integer.MIN_VALUE;
        int currentsmall;

        for (int i = 0; i < k; i++) {
            currentsmall = Integer.MAX_VALUE;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > kthsmall) {
                    if (nums[j] < currentsmall) {
                        currentsmall = nums[j];
                    }
                }
            }

            // No next distinct element exists
            if (currentsmall == Integer.MAX_VALUE) {
                return -1;
            }

            kthsmall = currentsmall;
        }

        return kthsmall;
    }
}
