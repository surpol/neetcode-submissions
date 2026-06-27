class Solution {
    public void reverseString(char[] s) {
        // two pointer
        // iterate and swap
        // next and previous
        int right = s.length - 1;
        for (int left = 0; left < s.length/2; left++) {
            char temp = s[left];
            System.out.println(left + " " + temp);
            s[left] = s[right];
            s[right] = temp;
            right--;
        }
    }
}