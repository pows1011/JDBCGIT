package step1;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		int i;
		int[] es = new int[4]; // 30명의 데이터 입력
		Scanner sc =new Scanner(System.in);
		int sum=0;
		double avg=0;
		
		for(i=0; i<es.length;i++) {
			System.out.println("Please,Input The Score :"+i);
			es[i]=sc.nextInt();
			sum+=es[i];
			
		}
		
		for(i=0; i<es.length;i++) {
			System.out.println(i+"번 값:"+es[i]);
			
		}
		avg=sum/es.length;
		
		
		System.out.println("총합:"+sum);
		System.out.println(" 평균 :"+avg);
	}

}
