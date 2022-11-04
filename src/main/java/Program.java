public class Program {
    public static void main(String[] args) {
        int[] nums = {4, 2, -1, 3, 7, 6, 6, 1};
        System.out.println(hasDuplicates(nums));
    }

    public static boolean hasDuplicates(int[] nums) {
        int fast = 1;
        for (int i = 0; i < nums.length; i++) {
            if (fast >= nums.length) {
                fast = fast - nums.length;
            }
            if (nums[i] == nums[fast] && i != fast) {
                return true;
            }
            fast += 2;
        }
        return false;
    }
}
