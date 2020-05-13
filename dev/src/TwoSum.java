public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 9};
        int[] answer = twoSum(nums,10);
        for(int n : answer) {
            System.out.println(n);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if ((nums[i] + nums[j]) == target) {
                    answer[0] = i < j ? i : j;
                    answer[1] = i > j ? i : j;

                    break;
                }
            }
        }
        return answer;
    }
}
