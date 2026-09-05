class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1){
            return 1;
        }

        int index = 0;
        int fast = 0;

        while (fast < n) {
            char slow = chars[fast];
            int count = 0;
            while (fast < n && chars[fast] == slow) {
                count++;
                fast++;
            }
            chars[index] = slow;
            index++;

            if (count > 1) {
                String countStr = Integer.toString(count);
                for (int j = 0; j < countStr.length(); j++) {
                    chars[index] = countStr.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}