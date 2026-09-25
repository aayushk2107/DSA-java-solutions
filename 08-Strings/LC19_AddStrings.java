class Solution {
    public String addStrings(String num1, String num2) {
        String sum = "";
        int size1 = num1.length() - 1;
        int size2 = num2.length() - 1;
        int carry = 0;

        while (size1 >= 0 || size2 >= 0 || carry != 0){

            int digit1 = 0;
            int digit2 = 0;

            if (size1 >= 0){
                digit1 = num1.charAt(size1) - '0';
                size1--;
            }
            
            if (size2 >= 0){
                digit2 = num2.charAt(size2) - '0';
                size2--;
            }

            int result = digit1 + digit2 + carry;

            sum += (char)('0' + (result % 10));

            carry = result / 10;
        }
        char[] arr = sum.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}