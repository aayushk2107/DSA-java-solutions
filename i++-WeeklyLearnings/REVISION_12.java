
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
on11thaugustirevisedthis


    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode curr = head;
        HashSet<ListNode> set = new HashSet<>();
        while(curr != null){
            if(set.contains(curr)){
                return curr;
            }
            set.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
on 14th august i did this

    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
/*on 21st i revised this*/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] arr = new int[r][c];
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int rows = 0;
        int cols = 0;
        for(int i = 0;i < r; i++){
            for(int j = 0;j < c; j++){
                arr[i][j] = mat[rows][cols];
                if(cols == mat[0].length -1){
                    rows++;
                    cols = 0;
                }
                else{
                    cols++;
                }
            }
        }
        return arr;
    }
}
on 12th sep i did this revision

    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}

on 19th sep i revised this

    class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        int left = 0;
        for(int i = 0;i < haystack.length();i++){
            int length = i - left + 1;
            if(length == needle.length()){
                int index = 0;
                int index1 = left;
                while(index < needle.length()){
                    if(needle.charAt(index) == haystack.charAt(index1)){
                        index++;
                        index1++;
                    }
                    else{
                        left++;
                        break;
                    }
                }
                if(index == needle.length() && needle.charAt(index - 1) == haystack.charAt(index1 - 1)){
                    return left;
                }
            }
        }
        return -1;
    }
}

on 27th sep i tryna solve this but got restrictions failed error 

    class Solution {
    public String multiply(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int ans = a * b;
        String ans1 = Integer.toString(ans);
        return ans1;
    }
}


on 29th sep i did this

    implemented this solution after weeks and did it ine one try 
    did this on a gap of more than 2 months btw it's really easy
Used a dummy node approach to execute everything in the loop itself 
    in the last approach i executed outside the loop even 
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        ListNode curr = list1;
        ListNode curr2 = list2;
        while(curr != null || curr2 != null){
            if(curr != null && curr2 != null){
                if(curr.val < curr2.val){
                    tail.next = curr;
                    curr = curr.next;
                }
                else{
                    tail.next = curr2;
                    curr2 = curr2.next;
                }
            }
            else if(curr == null && curr2 != null){
                tail.next = curr2;
                curr2 = curr2.next;
            }
            else{
                tail.next = curr;
                curr = curr.next;
            }
            tail = tail.next;
        }
        return dummy.next;
    }
}

on 1 october i did this 
    class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch , 0) + 1);
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0;i < 62;i++){
            char ch = 'a';
            if(i >= 0 && i < 26){
                ch = (char)('a' + i);
            }
            else if(i >= 26 && i < 52){
                ch = (char)('A' + (i - 26));
            }
            else{
                ch = (char)('0' + (i - 52));
            }
            if(map.containsKey(ch)){
                a1.add(map.get(ch));
            }
        }
        Collections.sort(a1);
        StringBuilder ans = new  StringBuilder();
        for(int i = a1.size() - 1;i >= 0;i--){
            char ch2 = '/';
            for(char ch : map.keySet()){
                int attempts = a1.get(i);
                if(map.get(ch) == attempts){
                    ch2 = ch;
                    while(attempts != 0){
                        ans.append(ch);
                        attempts--;
                    }
                    break;
                }
            }
            if(ch2 != '/'){
                map.remove(ch2);
            }
        }
        return new String(ans);
    }
}

on 4th october i revised this there isn't any logical bugs i found and able to find out the approach quickly
    class Solution {
    public String longestPalindrome(String s) {
        int beststart = 0;
        int bestend = 0;
        for(int i = 0; i < s.length();i++){
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            left++;
            right--;

            int start = i;
            int end = i + 1;

            while(start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            start++;
            end--;
            if(end - start + 1 > bestend - beststart + 1){
                beststart = start;
                bestend = end;
            }
            if(right - left + 1 > bestend - beststart + 1){
                beststart = left;
                bestend = right;
            }
        }
        return s.substring(beststart,bestend + 1);
    }
}


on 5th october i did this
    it's the simplest way btw if i will rememebr i will come back to it and won't use string conversion
    class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String ans = Integer.toString(x);
        int start = 0;
        int end = ans.length() - 1;
        while(start < end){
            if(ans.charAt(start) != ans.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

a CF cntest i went through on this 7th october DIV -3 
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int caseno = t;
        for(int ik = 0;ik < caseno;ik++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(x - r + " " + y);
        }
    }
}

on 9th october i revised and it took me a good amount of time to get it 
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists[0] == null && lists.length == 1){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for(int i = 0; i < 1; i++){
            ListNode curr1 = lists[i];
            ListNode curr = lists[1];
            while(curr != null && curr1 != null){
                if(curr.val < curr1.val){
                    tail.next = curr;
                    curr = curr.next;
                    tail = tail.next;
                }
                else{
                    tail.next = curr1;
                    curr1 = curr1.next;
                    tail = tail.next;
                }
            }
            if(curr == null && curr1 != null){
                tail.next = curr1;
                break;
            }
            else if(curr != null && curr1 == null){
                tail.next = curr;
                break;
            }
        }
        for(int i = 2;i < lists.length;i++){
            ListNode tail2 = dummy.next;
            ListNode prev = null;
            ListNode curr = lists[i];
            while(curr != null && tail2 != null){
                ListNode tai = null;
                if(curr.val < tail2.val){
                    tai = curr.next;
                    if(prev == null){
                        dummy.next = curr;
                        dummy.next.next = tail2;
                        prev = curr;
                        curr = tai;
                    }
                    else{
                        prev.next = curr;
                        prev = prev.next;
                        prev.next = tail2;
                        curr = tai;
                    }
                }
                else{
                    prev = tail2;
                    tail2 = tail2.next;
                }
            }
            if(curr != null && tail2 == null){
                prev.next = curr;
            }
        }
        return dummy.next;
    }
}
