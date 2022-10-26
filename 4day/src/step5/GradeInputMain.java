package step5;

import java.util.Scanner;

public class GradeInputMain {

	public static void main(String[] args) {
		
		GradeInput[] r=new GradeInput[3]; 						// 배열만 선언해놓은것 객체 생성한게 아님x
		Scanner sc =new Scanner(System.in); 					//console에 값을 입력하게 해주는 스캐너문 생성
		
	
		int i=0;												//반복문에 사용할 변수를 미리 선언하고 초기화
		
		for(i=0;i<r.length;i++) { 								//r = 상단에 정해둔 배열의 길이 만큼 반복 (3번)
			System.out.println("이름,국어,영어,수학 점수를 입력하세요");
			r[i]=new GradeInput();  							// 데이터를 입력하기 위해 객체를 생성한 것 ( 주소값을 할당 시킴 )
																// 상단에서 배열을 생성만 해놨기 때문에 값을 스캐너로 받아오기 위해서 객체를 생성
			r[i].name=sc.next();								// 각각 r[i]< gradeInput에서 가져온 객체에 값을 대입해줌
			r[i].kor=sc.nextInt();
			r[i].eng=sc.nextInt();
			r[i].math=sc.nextInt();
			r[i].total=r[i].kor+r[i].eng+r[i].math; 			//각 반복마다 1번씩 점수들을 모두 받아와 total에 저장 
			r[i].avg=(float)r[i].total/3;						// 평균을 구하는것 r[i].total = 반복 할때마다 1명마다 각각의 점수 총합에서 나누기 
		}
		
		for(i=0;i<r.length;i++) {
			System.out.print("이름"+r[i].name);
			System.out.print(" 국어"+r[i].kor);
			System.out.print(" 영어"+r[i].eng);
			System.out.print(" 수학"+r[i].math);
			System.out.print(" 총합"+r[i].total);
			System.out.print(" 평균"+r[i].avg);
			System.out.println();
		}
		
		

	}

}
