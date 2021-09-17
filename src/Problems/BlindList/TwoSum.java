package Problems.BlindList;

import java.util.Hashtable;

public class TwoSum {
  //Method gets two indexes that sum up to target, if it does not exist returns null
  public static int[] twoSum(int[] nums, int target) {
    Hashtable<Integer, Integer> valueIdx = new Hashtable<>();
    for (int i = 0; i < nums.length; i++) {
      if (valueIdx.containsKey(target - nums[i])) {
        return new int[] {i, valueIdx.get(target - nums[i])};
      }
      valueIdx.put(nums[i], i);
    }
    return null;
  }
}
