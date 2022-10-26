package step5;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {

		Calc c = new Calc();						//main에서 받아온 값을 저장or이용 해줄 Calc클래스를 C라는 객체(인스턴스)에 주소값을 담아줌
		Scanner sc = new Scanner(System.in);		//스캐너 받아올 sc객체 생성
		int x;										//스캐너에서 입력받은 숫자값을 저장할 변수 2개 선언
		int y;										
		int i = 0;									//while문의 메뉴필드에서 반복에서 보여줄 메뉴부분의 선택을 담당하는 숫자를 받아올 변수선언
		boolean flag = true;						//while문의 반복조건 (참이라면 반복) 을 만족하기위한 boolean

		while (flag) {
			System.out.println("1더하기");
			System.out.println("2빼기");
			System.out.println("3곱하기");		
			System.out.println("4나누기");
			System.out.println("5종료");
			i = sc.nextInt();						//위에 선언한 i값에 메뉴선택할 수를 입력받음

			switch (i) {
			case 1:
				System.out.println("더할 두개의 숫자 입력");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"+"+y+"="+c.add(x, y));
				break;
			case 2:
				
				System.out.println("뺄 두개의 숫자 입력");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"-"+y+"="+c.sub(x, y));
				break;
			case 3:
				System.out.println("곱할 두개의 숫자 입력");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"*"+y+"="+c.mul(x, y));
				break;
			case 4:
				System.out.println("나누기 할 두개의 숫자 입력");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"/"+y+"="+c.div(x, y));
				break;
			case 5:
				System.out.println("종료됩니다");
				flag=false;
				break;
			default:
				System.out.println("잘못된 숫자 입력");
				flag=false;
				break;

			}
		}

	}

}
