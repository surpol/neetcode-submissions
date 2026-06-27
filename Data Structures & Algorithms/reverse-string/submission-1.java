class Solution {
    public void reverseString(char[] s) {
        // two pointer
        // iterate and swap
        // next and previous
        int right = s.length - 1;
        int left = 0;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
    }
}