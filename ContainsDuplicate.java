import java.util.*;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}