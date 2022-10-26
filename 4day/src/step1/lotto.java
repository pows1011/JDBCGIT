package step1;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {

		Random r=new Random();
		int [] lotto=new int[6]; // 배열 lotto선언 후 6개의 공간
		
		//int num;
		
		
		for(int i=0; i <lotto.length; i++) { // 6번의 반복을 진행
			//num=r.nextInt(45)+1;
			lotto[i]=r.nextInt(45)+1; // 랜덤 수 뽑아오기 0~44까지의 수가아닌 1~45 까지 하기위해 +1
			for(int j=0;j<i;j++) {	// 중복제거 lotto[i]가 1번 반복될동안 j가 여러번 반복하며 
				if(/*num*/lotto[i]==lotto[j]) {	// lotto[0]~ lotto[j]의 숫자까지 같은 수가 있는지 체크
					--i;			//같은수가 존재할경우 --i를 해주어 바로 i의값을 -1시키고 다시 그 위치의 값을 받아옴
				//num=r.nextInt(45)+1;
					//k=-1;
				}
			}//lotto[i]=num;
		}System.out.println("로또 번호 추첨");
		for(int i=0;i<lotto.length;i++) {	// 나온 로또번호를 반복문으로 출력
			System.out.print((i+1)+"번째번호="+lotto[i]+"\t");
		}
	}	

}
