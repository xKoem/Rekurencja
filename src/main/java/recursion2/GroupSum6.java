package recursion2;

public class GroupSum6 {
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6)
            return groupSum6(start + 1, nums, target - nums[start] );
        return groupSum6(start + 1, nums, target - nums[start] ) || groupSum6(start + 1, nums, target);
    }
}
