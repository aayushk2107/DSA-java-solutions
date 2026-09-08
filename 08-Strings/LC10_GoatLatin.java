class Solution {
    public String toGoatLatin(String sentence) {
        char[] arr  = sentence.toCharArray();
        String ans = "";
        char space = ' ';
        int countWord = 0;
        int i = 0;
        while(i < arr.length){
            String ans1 = "";
            if(i == 0 || arr[i] == space){
                if(i != 0){
                    i++;
                }
                char first = '0';
                if(arr[i] == 'a' || arr[i] == 'e' || arr[i] =='i'|| arr[i] == 'o' || arr[i] =='u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                    while(i < arr.length && arr[i] != space ){
                        ans1 += arr[i];
                        i++;
                    }
                    ans1 += 'm';
                    ans1 += 'a';
                    countWord++;
                    int count = countWord;
                    while(count != 0){
                        ans1 += 'a';
                        count--;
                    }
                    if(i != arr.length){
                        char empty = ' ';
                        ans1 += empty;
                    }
                    ans += ans1;
                }
                else if(!(arr[i] == 'a' || arr[i] == 'e' || arr[i] =='i'|| arr[i] == 'o' || arr[i] =='u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')){
                    first = arr[i];
                    i++;
                    while(i < arr.length && arr[i] != space){
                        ans1 += arr[i];
                        i++;
                    }
                    ans1 += first;
                    ans1 += 'm';
                    ans1 += 'a';
                    countWord++;
                    int count = countWord;
                    while(count != 0){
                        ans1 += 'a';
                        count--;
                    }
                    if(i != arr.length){
                        char empty = ' ';    
                        ans1 += empty;
                    }
                    ans += ans1;
                }      
            }
        }
        return ans;
    }
}