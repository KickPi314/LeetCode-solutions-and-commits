class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0;  i < len; i ++) {
            int pointer = i + 1;
            while (pointer < len) {
                int sum = nums[i] + nums[pointer];
                if (sum == target) {
                    return new int[]{i, pointer}; 
                }
                pointer += 1;
            }
        }
        return new int[]{}; 
    }
}
