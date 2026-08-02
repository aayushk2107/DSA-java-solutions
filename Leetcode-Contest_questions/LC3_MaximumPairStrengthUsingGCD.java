class Solution {
    public long maxPairStrength(int[] nums) {
        long maxStrength = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i];
                int b = nums[j];
                int x = a;
                int y = b;

                while (y != 0) {
                    int temp = y;
                    y = x % y;
                    x = temp;
                }

                int gcd = x;

                long currentStrength = (1L * a * b) / (1L * gcd * gcd);

                if(maxStrength<currentStrength){
                    maxStrength=currentStrength;
                }
            }
       }

        return maxStrength;
    }
}