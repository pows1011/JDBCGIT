package step7;

public class MonthService {
	
	void month(int i) {		//month�޼ҵ尡 ���ϰ����� �Ű����� int i�� main���� i�� ���� �����޴´�
		
		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
			System.out.println("31��");
		}else if(i==4||i==6||i==9||i==11) {
			System.out.println("30��");
		}else if(i==2) {
			System.out.println("28��");
		}else {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");
		}
		
}
	
	
	void monthsw(int i) {		//���� ������ if���� �ƴ� switch������ ����
		
		switch(i) {
		
		case 1,3,5,7,8,10,12:
			System.out.println("31��");
			break;
		case 4,6,9,11:
			System.out.println("30��");
			break;
		case 2:
			System.out.println("28��");
			break;
		default:
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");
			break;
		}
	
	}
}