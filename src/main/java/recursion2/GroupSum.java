package recursion2;

public class GroupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length || target == 0) {
            return target == 0;
        }
        return groupSum(start + 1, nums, target - nums[start] )|| groupSum(start + 1, nums, target);
    }
}
