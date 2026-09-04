Approach 1
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

Approach 2

    class Solution {
    public String longestCommonPrefix(String[] strs) {
        String smallest = strs[0];
        for(int i = 1; i < strs.length; i++){
            int length = 0;
            String currentst = strs[i];
            int length1 = 0;
            int length2 = 0;
            int index = 0;
            if(currentst.length() < smallest.length()){
                length = smallest.length();
            }
            else{
                length = currentst.length();
            }
            while(index < length){
                if(length1 < currentst.length() && length2 < smallest.length() && currentst.charAt(index) < smallest.charAt(index)){
                    smallest = currentst;
                    break;
                }
                else if(length1 < currentst.length() && length2 < smallest.length() && currentst.charAt(index) > smallest.charAt(index)){
                    break;
                }
                else if(length1 >= currentst.length()){
                    smallest = currentst;
                }
                length1++;
                length2++;
                index++;
            }
        }

        String largest = strs[0];
        for(int i = 1; i < strs.length;i++){
            int length = 0;
            int index = 0;
            String currentst = strs[i];
            int length1 = 0;
            int length2 = 0;
            if(currentst.length() < largest.length()){
                length = largest.length();
            }
            else{
                length = currentst.length();
            }
            while(index < length){
                if(length1 < currentst.length() && length2 < largest.length() && currentst.charAt(index) > largest.charAt(index)){
                    largest = currentst;
                }
                else if(length1 < currentst.length() && length2 < largest.length() && currentst.charAt(index) < largest.charAt(index)){
                    break;
                }
                else if(length1 >= currentst.length()){
                    largest = currentst;
                }
                length1++;
                length2++;
                index++;
            }
        }
        int index1 = 0;
        String ans = "";
        while(index1 < smallest.length() && index1 < largest.length()){
            if(smallest.charAt(index1) == largest.charAt(index1)){
                ans += smallest.charAt(index1);
            }
            else{
                break;
            }
            index1++;
        }
        return ans;
    }
}
