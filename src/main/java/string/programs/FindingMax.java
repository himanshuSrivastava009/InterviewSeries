package string.programs;

public class FindingMax {
	static int maxvalue = Integer.MIN_VALUE;
	static int secondMax = Integer.MIN_VALUE;

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 11, 1, -1, 99, 7 };

		for (int i = 0; i < arr.length; i++) {
			if (maxvalue < arr[i]) {

				maxvalue = arr[i];

			}

		}

		System.out.println(maxvalue);

		for (int j = 0; j < arr.length; j++) {
			// System.out.println("value of max = " +maxvalue);
			if (secondMax < arr[j] && arr[j] != maxvalue) {

				secondMax = arr[j];
				// System.out.println("Second max value = " +secondMax);

			}

		}
		System.out.println(secondMax);
		int thirdlaegest = Integer.MIN_VALUE;
		for(int k=0;k<arr.length;k++) {
			
			if(thirdlaegest<arr[k] && arr[k]!=maxvalue && arr[k]!=secondMax) {
				
				thirdlaegest = arr[k];
			}
		}
		
		System.out.println("Third largest = " +thirdlaegest);
	}
}
