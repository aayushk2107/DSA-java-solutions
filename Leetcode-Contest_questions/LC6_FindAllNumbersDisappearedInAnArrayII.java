class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0;
        int end = 0;
        while(lower <= upper){
            if(set.contains(lower)){
                lower++;
                continue;
            }
            
            start = lower;
            while(lower <= upper && set.contains(lower) != true){
                end = lower;
                lower++;
            }
            end = lower - 1;
            List<Integer> range = new ArrayList<>();
            range.add(start);
            range.add(end);

            ans.add(range);
        }
        return ans;
    }
}