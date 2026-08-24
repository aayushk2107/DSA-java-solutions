class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for(int right = 0; right < nums.length ;right++){
            List<Integer> factor = primeFactors(nums[right]);
            for(int number : factor){
                map.put(number,map.getOrDefault(number,0)+1);
            }

            while(map.size() > k){
                List<Integer> factor1 = primeFactors(nums[left]);
                for(int number2 : factor1){
                    map.put(number2,map.get(number2) - 1);
                    if(map.get(number2) == 0){
                        map.remove(number2);
                    }
                }
                
                left++;
            }
            int length = right-left +1;
            if(maxLength < length){
                maxLength = length;
            }
        }
        return maxLength;   
    }
    private List<Integer> primeFactors(int n){
        List<Integer> pf = new ArrayList<>();
        for(int p = 2;p * p <= n;p++){
            if(n % p == 0){
                pf.add(p);

                while(n % p == 0){
                    n = n / p;
                }
            }
        }
        if(n > 1){
            pf.add(n);
        }
        return pf;
    }
}