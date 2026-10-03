class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        current.add(intervals[0][0]);
        current.add(intervals[0][1]);
        int j = 0;
        for(int i = 1; i < intervals.length; i++){
            if(current.get(1) >= intervals[i][0]){
                if(current.get(1) > intervals[i][1]){
                    j += 1;
                    if(!(j > j - 1)){
                        current.set(1 , intervals[i - 1][1]);
                    }
                }
                else{
                    current.set(1 , intervals[i][1]);
                }
                if(i + 1 == intervals.length){
                    ans.add(current);
                }
            }
            else{
                List<Integer> finalised = new ArrayList<>();
                finalised.add(current.get(0));
                finalised.add(current.get(1));
                ans.add(finalised);
                current.set(0 , intervals[i][0]);
                current.set(1 , intervals[i][1]);
                if(i + 1 == intervals.length){
                    ans.add(current);
                }
            }
        }
        if(intervals.length == 1){
            return intervals;
        }
        int [][]arr = new int[ans.size()][2];
        for(int i = 0;i < arr.length;i++){
            arr[i][0] = ans.get(i).get(0);
            arr[i][1] = ans.get(i).get(1);
        }
        return arr;
    }
}