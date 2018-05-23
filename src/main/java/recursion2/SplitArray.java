package recursion2;

public class SplitArray {
    public boolean splitArray(int[] nums) {
        return split(0, nums, 0, 0);
    }

    public boolean split(int index, int[] nums, int left, int right) {
        if (index >= nums.length) {
            return left == right;
        }
        return split(index + 1, nums , left + nums[index], right) ||
                split(index + 1, nums , left, right + nums[index]);
    }

}
