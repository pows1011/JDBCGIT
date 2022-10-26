package step1;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
	
		
		
		int i,max;
		
		int[] arr=new int[10];
		System.out.println("10개의 숫자를 입력해주세요");
		Scanner sc =new Scanner(System.in);
		max=arr[0];
		
		for(i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번째 값 입력 :");
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("최대값:"+max);

	}

}
