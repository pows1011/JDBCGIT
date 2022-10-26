package step1;

import java.util.Random;

public class TestRandom {
	
	
	public static void main(String[] args) {
	
		Random r=new Random();//메모리의 위치값을 힙
		
		int i=r.nextInt(3);//0~2까지의 값이 발생
		System.out.println(i);
		for(int j=0;j<10;j++) {
			i=r.nextInt(45)+1;// 0~45 까지 랜덤수 출력
			System.out.print(i);
		}
		
		
		

	}

}
