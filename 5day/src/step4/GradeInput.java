package step4;

import java.util.Scanner;

public class GradeInput {  	// GradeInput 클래스를 선언
	String name;		   	// 객체변수 ( class에서 선언된 변수 ) 
	int kor;
	int eng;		
	int math;
	int total;
	float avg;
	
	void input(Scanner sc) {	// input 이라는 메소드 생성 void = 리턴값 x
		System.out.println("이름"); // name객체변수에 스캐너 함수로 문자열값을 받아옴
		name=sc.next();
		System.out.println("국어점수");
		kor=sc.nextInt();
		System.out.println("영어점수");
		eng=sc.nextInt();
		System.out.println("수학점수");
		math=sc.nextInt();
		
		
	}
	
	void tot() {		// tot메소드 생성 				
		total=kor+eng+math; //total 객체변수에 3과목의 점수를 합산 (총점)
	}
	void avg() {	// avg메소드 생성
		avg=(float)total/3;	// total /3 (평균값)
	}
	void print() {
		System.out.print("이름"+name);
		System.out.print(" 국어"+kor);
		System.out.print(" 영어"+eng);
		System.out.print(" 수학"+math);
		System.out.print(" 총합"+total);
		System.out.print(" 평균"+avg);
		System.out.println();
	}
	
	
}
