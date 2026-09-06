class Solution {
    public int countRotations(String s, int k) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            String ans = "";
            for(int j = 0;j < s.length(); j++){
                ans += s.charAt((i + j) % s.length());
            }
            int m = 0;
            int similarity = 0;
            while(m < ans.length() - 1){
                if(ans.charAt(m) == ans.charAt(m + 1)){
                    similarity++;
                }
                m++;
            }
            if(similarity == k){
                count++;
            }
        }
        return count;
    }
}