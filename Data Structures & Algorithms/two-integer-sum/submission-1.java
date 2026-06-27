class Solution {
    public int[] twoSum(int[] nums, int target) {
        // iterate the list
        // difference between target and nums[i]
        // store nums[i] in arraylist
        // if difference is contained. return that
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (list.containsKey(difference)){
                if (list.get(difference) < i) {
                    return new int[]{list.get(difference), i};
                }
                return new int[]{i, list.get(difference)};
            } else {
                list.put(nums[i], i);
            }
        }
        return null;
    }
}
