package step5;

import java.util.Scanner;

public class GradeInputMain {

	public static void main(String[] args) {
		
		GradeInput[] r=new GradeInput[3]; 						// �迭�� �����س����� ��ü �����Ѱ� �ƴ�x
		Scanner sc =new Scanner(System.in); 					//console�� ���� �Է��ϰ� ���ִ� ��ĳ�ʹ� ����
		
	
		int i=0;												//�ݺ����� ����� ������ �̸� �����ϰ� �ʱ�ȭ
		
		for(i=0;i<r.length;i++) { 								//r = ��ܿ� ���ص� �迭�� ���� ��ŭ �ݺ� (3��)
			System.out.println("�̸�,����,����,���� ������ �Է��ϼ���");
			r[i]=new GradeInput();  							// �����͸� �Է��ϱ� ���� ��ü�� ������ �� ( �ּҰ��� �Ҵ� ��Ŵ )
																// ��ܿ��� �迭�� ������ �س��� ������ ���� ��ĳ�ʷ� �޾ƿ��� ���ؼ� ��ü�� ����
			r[i].name=sc.next();								// ���� r[i]< gradeInput���� ������ ��ü�� ���� ��������
			r[i].kor=sc.nextInt();
			r[i].eng=sc.nextInt();
			r[i].math=sc.nextInt();
			r[i].total=r[i].kor+r[i].eng+r[i].math; 			//�� �ݺ����� 1���� �������� ��� �޾ƿ� total�� ���� 
			r[i].avg=(float)r[i].total/3;						// ����� ���ϴ°� r[i].total = �ݺ� �Ҷ����� 1���� ������ ���� ���տ��� ������ 
		}
		
		for(i=0;i<r.length;i++) {
			System.out.print("�̸�"+r[i].name);
			System.out.print(" ����"+r[i].kor);
			System.out.print(" ����"+r[i].eng);
			System.out.print(" ����"+r[i].math);
			System.out.print(" ����"+r[i].total);
			System.out.print(" ���"+r[i].avg);
			System.out.println();
		}
		
		

	}

}
