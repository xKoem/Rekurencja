package pl.xkoem.recursion1;

public class Array220 {
    public boolean array220(int[] nums, int index) {
        if (index > nums.length-2) {
            return false;
        }
        if (nums[index+1] == nums[index] * 10) {
            return true;
        }
        return array220(nums, index + 1);
    }
}
