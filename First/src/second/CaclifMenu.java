package second;

import java.util.Scanner;

public class CaclifMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		boolean boo=true;
		
		
		while(boo) { // while문은 true일경우계속 반복
			
			
			// 1 ~ 6까지 선택하게끔 설명문
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("5.나머지");
			System.out.println("6.종료");
			int i=sc.nextInt();
			// scanner함수로 값 console입력
			if(i==1) { // if문으로 각각 번호별 대응 값 
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"+"+b+"="+(a+b));
			}else if(i==2) {
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"-"+b+"="+(a-b));
			}else if(i==3) {
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"*"+b+"="+a*b);	
			}else if(i==4) {
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"/"+b+"="+(float)a/b);	
			}else if(i==5) {
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"%"+b+"="+a%b);	
			}else if(i==6) {
				boo=false;
				System.out.println("종료");
			}else {
				System.out.println("잘못된 값");
			}
			
		}
		sc.close();
		
		

	}

}
