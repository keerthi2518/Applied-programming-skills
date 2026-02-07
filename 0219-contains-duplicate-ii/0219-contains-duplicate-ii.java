import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            // Update the latest index of the number
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Contains Nearby Duplicate: " + result);
    }
}
