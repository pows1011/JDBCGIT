package step4;

import java.util.Scanner;

public class GradeInputMain {

	public static void main(String[] args) {
		
		GradeInput[] r=new GradeInput[3];	//gradeInput�� �ν��Ͻ� r�� �迭���� 3���� �迭
		Scanner sc=new Scanner(System.in);
		int i=0;
		
		for(i=0;i<r.length;i++) { 								
			r[i]=new GradeInput();	//r�� ���� �Է��ϱ����� ��ü����(�ּҰ� ����)
																
			r[i].input(sc);	// class���� .input�� �ش��ϴ� ��ɱ����� �޾ƿ� ��ĳ�ʸ� ���Խ��Ѽ� �� �Է�
			r[i].tot();	
			r[i].avg();
		}
		
		for(i=0;i<r.length;i++) {
			r[i].print();
		}
		
	}

}
