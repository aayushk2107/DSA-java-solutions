 Approach - 1 
     solved with simple brute force solution 😭😭😭 and got a gift of TLE in return

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int count1 = 1;
        int count2 = 9;
        for(int i = 0; i < num - 1; i++){
            count1 = count1 * 10 + 0;
            count2 = count2 * 10 + 9;
        }
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i = count1; i <= count2; i++){
            int element = i;
            int add = 0;
            while(element > 0){
                add += element % 10;
                element /= 10;
            }
            if(sum == add){
                long square = 0;
                int element1 = i;
                while(element1 > 0){
                    int digit = element1 % 10;
                    square += (digit * digit);
                    element1 /= 10;
                }
                map.put(i,square);
            }
            else{
                continue;
            }
        }
        long largest = 0;
        for(int i : map.keySet()){
            if(map.get(i) > largest){
                largest = map.get(i);
            }
        }
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : map.keySet()){
            if(map.get(i) == largest){
                set.add(i);
            }
        }
        int largest1 = 0;
        for(int i : set){
            if(largest1 < i){
                largest1 = i;
            }
        }
        if(largest1 == 0){
            return "";
        }
        else{
            String ans1 = Integer.toString(largest1);
            return ans1;
        }
    }
}
Approach 2 - Greedy 
 The approach says that ignore all things and focus directly on looking for the maximum number by starting the number counting by 9 
  i am simply unable to generate the appraoch independently
 class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        if(9 * num < sum){
            String ans1 = new String(ans);
            return ans1;
        }
        int number = 0;
        for(int i = 0; i < num; i++){
            if(sum < 9){
                ans.append(sum);
                sum = 0;
            }
            else{
                ans.append(9);
                sum -= 9;
            }
        }
        String ans1 = new String(ans);
        return ans1;
    }
}
