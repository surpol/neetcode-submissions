class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s1.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        for (int r = 0; r < s2.length(); r++ ) {
            HashMap<Character, Integer> count2 = new HashMap<>();
            int cur = 0;
            for (int i = r; i < s2.length(); i++) {
                char c = s2.charAt(i);
                count2.put(c, count2.getOrDefault(c, 0) + 1);

                if (count.getOrDefault(c, 0) < count2.get(c)) {
                    break;
                }

                if (count.getOrDefault(c, 0) == count2.get(c)) {
                    cur++;
                }

                if (cur == count.size()) {
                    return true;
                }

            }
            
        }
        return false;
    }
}
