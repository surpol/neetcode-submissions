class Solution {
    public String longestCommonPrefix(String[] strs) {
        //substring

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++ ) {
            int j = 0;
            while ( j < Math.min(strs[i].toCharArray().length, prefix.length())) {
                if (strs[i].charAt(j) != prefix.charAt(j)) {
                    break;
                }
                j++;
            }
            prefix = strs[0].substring(0, j);
        }
        return prefix;

    }
}