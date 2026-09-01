class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int mismatchCount = 0;
        int first = -1;
        int second = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                mismatchCount++;
                if (first == -1) {
                    first = i;
                } 
                else if (second == -1) {
                    second = i;
                } 
                else {
                    return false;
                }
            }
        }
        if (mismatchCount == 0) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {

                    if (s.charAt(i) == s.charAt(j)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (mismatchCount != 2) {
            return false;
        }
        char[] equal = s.toCharArray();
        char temp = equal[first];
        equal[first] = equal[second];
        equal[second] = temp;
        for (int i = 0; i < equal.length; i++) {
            if (equal[i] != goal.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}