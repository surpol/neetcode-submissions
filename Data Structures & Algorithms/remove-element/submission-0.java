class Solution {
    public int removeElement(int[] nums, int val) {
        // iterate nums
        // if nums[i] == val ; rm nums[i]
        // then if nums [i - 1] is null; move nums[i-1] to nums[i]
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}