class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans1 = strs[0];
        String ans2 = strs[strs.length - 1];
        int index1 = 0;
        while(index1 < ans1.length()){
            if(ans1.charAt(index1) == ans2.charAt(index1)){
                 index1++;
            }
            else{
                break;
            }
        }
        return ans1.substring(0,index1);
    }
}