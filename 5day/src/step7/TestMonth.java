package step7;

import java.util.Scanner;

public class TestMonth {
	public static void main(String[] args) {
		MonthService m=new MonthService();		//monthŬ������ �ҷ��� m�̶�� �̸����� ��ü�� �Ҵ� m�� monthService�� �ν��Ͻ�
		Scanner sc=new Scanner(System.in);
		System.out.println("1~12���� ���� �Է��ϼ���");
		int i;						//month �޼ҵ��� month or monthsw�� �Ű����� int i �� �Է°��� �� ����
		m.monthsw(i=sc.nextInt());  //�޼ҵ��� month or monthsw�� �Ű������� ��ĳ�� �Լ��� ���� �־���
		
		System.out.println();
	}
	
}
