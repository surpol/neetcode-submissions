class Solution {
    public int longestConsecutive(int[] nums) {
        // sort list
        // count if nums[i] + 1 = num[i+1]
        // store max

        int max = 0;
        int tmpMax = 1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (i < nums.length - 1 && nums[i] == nums[i+1]) {
                continue;
            }
            else if (i < nums.length - 1 && nums[i] + 1 == nums[i+1]) {
                tmpMax++;
            } else {
                tmpMax = 1;
            }
            max = Math.max(max, tmpMax);
        }
        return max;
    }
}
