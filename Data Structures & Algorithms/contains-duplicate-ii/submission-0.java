class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 2 for loops
        // condition in nested loop to keep going until j <= i + k

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < Math.min(nums.length, i + k + 1); j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(i);
                    System.out.println("i: " + nums[i]);
                    System.out.println("j: " + nums[j]);
                    return true;
                }
            }
        }
        return false;
    }
}