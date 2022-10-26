package step7;

public class MonthService {
	
	void month(int i) {		//month메소드가 리턴값없이 매개변수 int i로 main에서 i의 값을 제공받는다
		
		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
			System.out.println("31일");
		}else if(i==4||i==6||i==9||i==11) {
			System.out.println("30일");
		}else if(i==2) {
			System.out.println("28일");
		}else {
			System.out.println("잘못된 값을 입력하였습니다");
		}
		
}
	
	
	void monthsw(int i) {		//같은 예제로 if문이 아닌 switch문으로 적용
		
		switch(i) {
		
		case 1,3,5,7,8,10,12:
			System.out.println("31일");
			break;
		case 4,6,9,11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		default:
			System.out.println("잘못된 값을 입력하였습니다");
			break;
		}
	
	}
}