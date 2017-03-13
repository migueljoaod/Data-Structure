package estd;

public class BigDiff {

	public int bigDiff(int[] nums) {

		int max = nums[0];
		int min = nums[0];

		for (int i : nums) {
			max = Math.max(max, i);
			min = Math.min(min, i);
		}

		return max - min;
	}

	public static void main(String[] args) {
		int result = Integer.MAX_VALUE + Integer.MAX_VALUE;
		System.out.println(result);
	}

}
