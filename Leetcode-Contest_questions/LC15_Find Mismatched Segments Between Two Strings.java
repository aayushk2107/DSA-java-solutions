class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
        int i = 0;
        while(i < s1.length()){
            String first = "";
            String second = "";
            List<String> ans1 = new ArrayList<>();
            int info = 0;
            while(i < s1.length() && s1.charAt(i) != s2.charAt(i)){
                first += s1.charAt(i);
                second += s2.charAt(i);
                i++;
                info++;
            }
            if(info != 0){
                ans1.add(first);
                ans1.add(second);
                ans.add(ans1);
            }
            i++;
        }
        return ans;
    }
}