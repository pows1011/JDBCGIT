package step6;

public class ScoreBoard {
									
	void printScore(int i) {			//princScore 메소드선언 매개변수(입력받는 값 )정수형 int 타입으로 받아옴	
		String str = null;				//main에서 받아온 i로 조건문에 타당한 값이 입력되면 그값에 맞는 출력
										//메소드 안에 변수를 선언하면 그 메소드 안에서만 적용되는 지역변수로 선언

		if (i >= 90 && i <= 100) {
			str = "A";
		} else if (i >= 80 && i <= 89) {
			str = "B";
		}	else if (i >= 70 && i <= 79) {
			str = "C";
		}else if (i >= 60 && i <= 69) {
			str = "D";
		}else if(i>=0&&i<=59){
			str="F";
		}else {
			str="잘못된 데이터";
		}System.out.println(str);
	}
}
