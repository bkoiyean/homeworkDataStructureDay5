package Day5;

public class OddNumOn {
	public static void main(String[] args) {
		int [] inputArray = {1,-3,2,3,4,5,4,3,4,5,3,15,15,14,333,233,333,44,44,555,333};
		
		int [] negativeArray = new int [Math.max(0,-minValue(inputArray) + 1)];
		
		int [] positiveArray = new int [Math.max(0,maxValue(inputArray) + 1)];
		
		for (int i = 0; i < inputArray.length; i ++) {
			if (inputArray[i]<0) {
				negativeArray[-inputArray[i]] += 1;
			}
			else positiveArray[inputArray[i]] += 1;
		}
		
		for (int i = 0; i < negativeArray.length; i++) {
			if (negativeArray[i] % 2 == 1) {
				System.out.print(-i + " ");
			}
		}
		
		for (int i = 0; i < positiveArray.length; i++) {
			if (positiveArray[i] % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static int maxValue(int[] array) {
		int max = array[0];

		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		return max;

	}
	
	public static int minValue(int[] array) {
		int min = array[0];

		for (int i : array) {
			if (min > i) {
				min = i;
			}
		}
		return min;

	}

}
