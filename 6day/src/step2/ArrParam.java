package step2;

public class ArrParam {

	int max; // 전역변수 또는 인스턴스 변수
	int sum;
	float avg;

	void makeMax(int[] arr) { // 메소드는 스택영역
		int i; // 지역변수 호출,실행 후 사라지는 값
		max=arr[0];
		for(i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
					
		}
	} 
	
	void makeSum(int[]arr) {
		int i;
		sum=0;
		for(i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
	}
	
	void makeAvg(int[] arr) {
		makeSum(arr);
		avg=(float)sum/arr.length;
		
	}
	
	

}
