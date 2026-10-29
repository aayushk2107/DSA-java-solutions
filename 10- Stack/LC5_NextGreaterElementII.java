approach is right but not according to monotonic stack and it passed few testcases 

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        int [] arr = new int[nums.length];
        s1.push(nums[0]);
        int n = nums.length;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= s1.peek()){
                int index = i;
                while(nums[Math.abs((0 - index) % n)] <= s1.peek() && Math.abs((0 - index) % n) != i - 1){
                    index++;
                }
                if(nums[Math.abs((0 - index) % n)] > s1.peek()){
                    arr[i] = nums[Math.abs((0 - index) % n)];
                }
            }
            else{
                arr[i - 1] = nums[i];
                s1.pop();
                s1.push(nums[i]);
            }
        }

        s1.pop();
        s1.push(nums[nums.length - 1]);
        int ind = nums.length - 1;
        int index = 0;
        while(ind == nums.length - 1){
            if(nums[index] <= s1.peek()){
                while(nums[Math.abs((0 - index) % n)] <= s1.peek() && Math.abs((0 - index) % n) != ind){
                    index++;
                }
                if(nums[Math.abs((0 - index) % n)] > s1.peek()){
                    arr[ind] = nums[Math.abs((0 - index) % n)];
                }
            }
            else{
                arr[ind] = nums[index];
                s1.pop();
                s1.push(nums[ind]);
            }
            ind++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        return arr;
    }
}