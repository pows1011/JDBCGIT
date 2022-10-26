package step4;

import java.util.Scanner;

public class GradeInputMain {

	public static void main(String[] args) {
		
		GradeInput[] r=new GradeInput[3];	//gradeInput의 인스턴스 r을 배열선언 3개의 배열
		Scanner sc=new Scanner(System.in);
		int i=0;
		
		for(i=0;i<r.length;i++) { 								
			r[i]=new GradeInput();	//r에 값을 입력하기위해 객체지정(주소값 선언)
																
			r[i].input(sc);	// class에서 .input에 해당하는 기능구성을 받아옴 스캐너를 포함시켜서 값 입력
			r[i].tot();	
			r[i].avg();
		}
		
		for(i=0;i<r.length;i++) {
			r[i].print();
		}
		
	}

}
