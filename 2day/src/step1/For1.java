package step1;

public class For1 {

	public static void main(String[] args) {

		int i, sum = 0;

		for (i = 1; i <= 100; i++) {

			sum += i;
		}
		System.out.println("1~100������ ��:" + sum);
		
		System.out.println("-----------------");
		for (i = 1; i <= 10; i += 2) {

			System.out.println(i);

		}
		System.out.println("-----------------");
		
		//¦���� �� +=2  i�� 2�� ������
		for (i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		
		for(i=10;i>=1;i--) {
			System.out.println(i);
		}
	}

}
