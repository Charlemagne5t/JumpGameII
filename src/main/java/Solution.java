public class Solution {
    public int jump(int[] nums) {
        Integer[] memo = new Integer[nums.length + 1];
        return dfs(nums, 0, memo);
    }

    public int dfs(int[] nums, int i, Integer[] memo) {
        if (i >= nums.length - 1) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }

        int cost = Integer.MAX_VALUE / 2;
        for (int j = 1; j <= nums[i]; j++) {
            cost = Math.min(cost, 1 + dfs(nums, i + j, memo));
        }
        memo[i] = cost;
        return cost;
    }
}
