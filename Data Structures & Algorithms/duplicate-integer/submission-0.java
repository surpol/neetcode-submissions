class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {
            if (list.contains(i)) {
                return true;
            } else {
                list.add(i);
            }
        }
        return false;
    }
}