package step4;

import java.util.Scanner;

public class GradeInput {  	// GradeInput Ŭ������ ����
	String name;		   	// ��ü���� ( class���� ����� ���� ) 
	int kor;
	int eng;		
	int math;
	int total;
	float avg;
	
	void input(Scanner sc) {	// input �̶�� �޼ҵ� ���� void = ���ϰ� x
		System.out.println("�̸�"); // name��ü������ ��ĳ�� �Լ��� ���ڿ����� �޾ƿ�
		name=sc.next();
		System.out.println("��������");
		kor=sc.nextInt();
		System.out.println("��������");
		eng=sc.nextInt();
		System.out.println("��������");
		math=sc.nextInt();
		
		
	}
	
	void tot() {		// tot�޼ҵ� ���� 				
		total=kor+eng+math; //total ��ü������ 3������ ������ �ջ� (����)
	}
	void avg() {	// avg�޼ҵ� ����
		avg=(float)total/3;	// total /3 (��հ�)
	}
	void print() {
		System.out.print("�̸�"+name);
		System.out.print(" ����"+kor);
		System.out.print(" ����"+eng);
		System.out.print(" ����"+math);
		System.out.print(" ����"+total);
		System.out.print(" ���"+avg);
		System.out.println();
	}
	
	
}
