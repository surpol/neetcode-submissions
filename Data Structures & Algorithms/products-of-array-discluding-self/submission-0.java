class Solution {
    public int[] productExceptSelf(int[] nums) {
        // output array
        // iterate twice
        // multiply nums[i] to every index except i
        // return output

        int[] resp = new int[nums.length];
        Arrays.fill(resp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if ( j == i) {
                    continue;
                }
                resp[j]*= nums[i];
            }
        }
        return resp;

    }
}  
