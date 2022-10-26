package step2;

public class ArrParamMain {

	public static void main(String[] args) {
		ArrParam ap = new ArrParam();
		int[] arr1 = { 1, 2, 3, 4, 5};

		ap.makeMax(arr1);
		ap.makeSum(arr1);
		ap.makeAvg(arr1);

		System.out.println(ap.max);
		System.out.println(ap.sum);
		System.out.println(ap.avg);
		System.out.println();
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		ap.makeMax(arr2);
		ap.makeSum(arr2);
		ap.makeAvg(arr2);

		System.out.println(ap.max);
		System.out.println(ap.sum);
		System.out.println(ap.avg);
		
		ArrParam ap2 = new ArrParam();
	}

}
