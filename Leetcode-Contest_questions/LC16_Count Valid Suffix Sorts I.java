class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            List<Integer> l1 = new ArrayList<>();
            for(int j = i; j < nums.length; j++){
                l1.add(nums[j]);
            }
            Collections.sort(l1);
            List<Integer> l2 = new ArrayList<>();
            int number = 0;
            for(int k = 0; k < i; k++){
                l2.add(nums[k]);
                number++;
            }
            for(int k = l1.size() - 1; k >= 0; k--){
                l2.add(l1.get(k));
            }
            boolean failure = true;
            for(int k = 0; k < nums.length; k++){
                if(target[k] != l2.get(k)){
                    failure = false;
                }
            }
            if(failure == true){
                index++;
            }
        }
        return index;
    }
}