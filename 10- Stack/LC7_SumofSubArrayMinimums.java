Approach 1 - SIMPLE BRUTE FORCE

class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                }
                sum += min;
            }
        }
        return (int)(sum % 1000000007);
    }
}

Approach 2 - Used Monotonic Stack and felt dead in implementations

    class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<int []> s1 = new Stack<>();
        long currsum = 0;
        long answer = 0;
        long mod = 1000000007;

        for(int i = 0; i < arr.length; i++){
            int frequency = 1;
            while(!s1.isEmpty() && s1.peek()[0] >= arr[i]){
                int [] pair = s1.pop();
                currsum -= (long) pair[0] * pair[1];
                frequency += pair[1];
            }
            s1.push(new int[]{arr[i], frequency});

            currsum += (long) arr[i] * frequency;
            answer = (answer + currsum) % mod;
        }
        return (int) answer;
    }
}

NOT AN APPROACH BUT I REPRODUCED IT BOTH IN IDEA AND IN IMPLEMENTATION WHICH IS MORE CELEBRATED THAN ANYTHING ELSE

    class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<int []> s1 = new Stack<>();
        long sum = 0;
        long currsum = 0;
        long mod = 1000000007;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            while(!s1.isEmpty() && arr[i] <= s1.peek()[0]){
                count += s1.peek()[1];
                currsum -= s1.peek()[0] * s1.peek()[1];
                s1.pop();
            }
            s1.push(new int []{arr[i] , count});
            currsum += s1.peek()[0] * s1.peek()[1];
            sum += currsum;
        }
        return (int)(sum % mod);
    }
}
