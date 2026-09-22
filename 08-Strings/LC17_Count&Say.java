class Solution {
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder();
        int i = 1;
        ans.append(1);
        while(i <= n){
            StringBuilder ans1 = new StringBuilder();
            ans1.append(ans);
            ans.setLength(0);
            int j = 0;
            while(j < ans1.length()){
                int frequency = 0;
                int k = j;
                while(k < ans1.length()){
                    if(ans1.charAt(j) == ans1.charAt(k)){
                        frequency++;
                        k++;
                    }
                    else{
                        break;
                    }
                }
                ans.append(frequency);
                if(i != 1){
                    ans.append(ans1.charAt(j));
                }
                if(k == ans1.length()){
                    break;
                }
                j = k;
            }
            i++;
        }
        String ans1 = new String(ans);
        return ans1;
    }
}