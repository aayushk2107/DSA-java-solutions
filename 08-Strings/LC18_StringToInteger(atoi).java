class Solution {
    public int myAtoi(String s) {
        char ws = ' ';
        int ans = 0;
        boolean started = false;
        int pre = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ws && started == false) {
                continue;
            }
            if (ch == ws && started == true) {
                break;
            }

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z')) {

                if (started == false) {
                    return 0;
                }
                break;
            }

            if ((ch == '+' || ch == '-') && started == true) {
                break;
            }

            if (ch == '-' && started == false) {
                pre = 1;
                started = true;
                continue;
            }
            if (ch == '+' && started == false) {
                started = true;
                continue;
            }
            if (ch == '.' && started == false) {
                return 0;
            }
            if (ch == '.' && started == true) {
                break;
            }
            if (ch >= '0' && ch <= '9') {

                int digit = ch - '0';
                if (pre == 1) {
                    if (ans > 214748364 ||
                        (ans == 214748364 && digit > 7)) {
                        return -2147483648;
                    }
                }
                else {
                    if (ans > 214748364 ||
                        (ans == 214748364 && digit > 7)) {
                        return 2147483647;
                    }
                }
                ans = ans * 10 + digit;
                started = true;
            }
        }
        if (pre == 1) {
            ans = -ans;
        }
        return ans;
    }
}