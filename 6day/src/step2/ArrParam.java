package step2;

public class ArrParam {

	int max; // �������� �Ǵ� �ν��Ͻ� ����
	int sum;
	float avg;

	void makeMax(int[] arr) { // �޼ҵ�� ���ÿ���
		int i; // �������� ȣ��,���� �� ������� ��
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
