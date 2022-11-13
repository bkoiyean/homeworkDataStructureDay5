package Day5;

public class SquareIntegers {
	public static int countStep1, countStep2;

	public static void main(String[] args) {
		int inputA = 25000000;
		int inputB = 49000000;

		System.out.println(sqrtIntFloor(inputB) - sqrtIntCeil(inputA) + 1);
		System.out.println("Steps: " + (countStep1 + countStep2));

	}
	
	public static int sqrtIntCeil(int num) {
		int left = 0;
		int right = num;
		int mid = 0;

		while (left<right) {
			countStep2 += 1;
			mid = left + (right - left) / 2;

			if ((mid+1)*(mid+1)==num) {
				return mid + 1;
			}
			
			if (mid*mid==num) {
				return mid;
			}
			if (mid*mid<=num && (mid+1)*(mid+1)>num) {
				return mid + 1;
			} 
			if (mid * mid < num) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return mid + 1;
	}
		
	public static int sqrtIntFloor(int num) {
		int left = 0;
		int right = num;
		int mid = 0;

		while (left<right) {
			countStep1 += 1;
			mid = left + (right - left) / 2;

			if ((mid+1)*(mid+1)==num) {
				return mid + 1;
			}
			if (mid*mid<=num && (mid+1)*(mid+1)>num) {
				return mid;
			} 
			if (mid * mid < num) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return mid;
	}

}
