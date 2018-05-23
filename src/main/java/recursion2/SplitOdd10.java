package recursion2;

public class SplitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return split(0, nums, 0, 0);
    }

    public boolean split(int index, int[] nums, int left, int right) {
        if (index >= nums.length) {
            return (left%10 == 0 && right%2 == 1) ||
                    (right%10 == 0 && left%2 == 1);
        }
        return split(index + 1, nums , left + nums[index], right) ||
                split(index + 1, nums , left, right + nums[index]);
    }
}
