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
