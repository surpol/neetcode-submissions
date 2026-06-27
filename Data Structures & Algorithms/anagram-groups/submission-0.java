class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // iterate strs
        // s = sort strs[i]
        HashMap<String, List<String>> map = new HashMap<>();
        // hashmap key value is s : List<strs[i]>

        for (int i = 0; i < strs.length;i++ ) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(strs[i]);
        }

        return new ArrayList<>(map.values());

    }
}
