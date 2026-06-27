class Solution {
    public int[] twoSum(int[] nums, int target) {
        // iterate the list
        // difference between target and nums[i]
        // store nums[i] in arraylist
        // if difference is contained. return that
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(target - nums[i])){
                return new int[] {list.get(target - nums[i]), i};
            } else {
                list.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
