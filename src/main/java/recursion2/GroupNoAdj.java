package recursion2;

public class GroupNoAdj {
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length || target == 0) {
            return target == 0;
        }
        return groupNoAdj(start + 2, nums, target - nums[start] ) || groupNoAdj(start + 1, nums, target);
    }
}
