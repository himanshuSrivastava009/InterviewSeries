package selenium.interview.series;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountDistinctNumbers {

	static int[] arr = new int[] { 3, 3, 7, 7, 10, 11, 11 };
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static int singleNonDuplicate(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		for (Entry<Integer, Integer> entryMap : map.entrySet()) {

			if (entryMap.getValue() == 1) {
				return entryMap.getKey();
			}

		}
		return 0;
	}

	public static void main(String[] args) {

		System.out.println(singleNonDuplicate(arr));
	}
}
