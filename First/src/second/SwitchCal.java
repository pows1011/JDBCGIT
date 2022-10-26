package second;

import java.util.Scanner;

public class SwitchCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a값 입력해주세요 : ");
		int a=sc.nextInt();
		System.out.println("b값 입력해주세요 : ");
		int b=sc.nextInt();
		System.out.println("두 수를 계산할 부호를 선택해주세요 : ");
		String c=sc.next();
		
		switch(c) {
		
		case "+":
			System.out.println(a+"+"+b+"="+a+b);
			break;
		case "-":
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*":
			System.out.println(a+"*"+b+"="+a*b);
			break;
		case "/":
			System.out.println(a+"/"+b+"="+(float)a/b);
			break;
		case "%":
			System.out.println(a+"%"+b+"="+a%b);
			break;
			default:
				System.out.println("잘못된 부호가 입력되었습니다.");
				break;
		}

	}

}
