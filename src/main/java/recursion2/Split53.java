package recursion2;

public class Split53 {
    public boolean split53(int[] nums) {
        return split(0, nums, 0, 0);
    }

    public boolean split(int index, int[] nums, int left, int right) {
        if (index >= nums.length) {
            return left == right;
        }
        if (nums[index] % 5 == 0) {
            return split(index + 1, nums , left + nums[index], right);
        }
        if (nums[index] % 3 == 0) {
            return split(index + 1, nums , left, right + nums[index]);
        }
        return split(index + 1, nums , left + nums[index], right) ||
                split(index + 1, nums , left, right + nums[index]);
    }
}
