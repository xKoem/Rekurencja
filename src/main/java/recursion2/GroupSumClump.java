package recursion2;

public class GroupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length || target == 0) {
            return target == 0;
        }
        int next;
        int firstValue = nums[start];
        for(next = start; next < nums.length && firstValue == nums[next]; next++);

        return groupSumClump(next, nums, target - (firstValue * (next - start)) )
                || groupSumClump(next, nums, target);
    }
}
