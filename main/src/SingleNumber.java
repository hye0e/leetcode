import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> cntMap = new HashMap<>();

        for (int num : nums) {
            cntMap.put(num, cntMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (cntMap.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
}
