class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        int sum = 0;
        int sum2 = 0;
        if (k > 0) {
            for (int i = 0; i < n + Math.abs(k); i++) {
                sum += code[i % n];
                if (i >= k) {
                    sum -= code[i - k];
                    arr[i - k] = sum;
                }
            }
        } 
        else if(k < 0) {
            int absK = Math.abs(k);
            for (int j = 1; j <= absK; j++) {
                sum2 += code[(n - j) % n];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = sum2;
                sum2 -= code[((i - absK) % n + n) % n];
                sum2 += code[i];
            }
        }
        return arr;
    }
}