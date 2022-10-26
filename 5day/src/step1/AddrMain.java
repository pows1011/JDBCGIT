package step1;

import java.util.Scanner;



public class AddrMain {

	public static void main(String[] args) {
		Addr[] a=new Addr[10];
		Scanner sc =new Scanner(System.in);
		int i=0;
		boolean flag=true;
		int num=0;
		int cnt=0;
		String name,Tel,address; // 메인 에서만 사용할 변수
								 // 실행은 메인에서만 하기 때문
		
		while(flag) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			num=sc.nextInt();
			
			switch(num) {
			
			case 1 : 
				a[cnt]=new Addr();
				System.out.println("이름");
				a[cnt].name=sc.next();
				System.out.println("주소");
				a[cnt].address=sc.next();
				System.out.println("전화번호");
				a[cnt].Tel=sc.next();
				
				cnt++;
				if (cnt>9) {
					System.out.println("공간 초과");
					--cnt;
					System.out.println(cnt);
				}
					
				break;
				
			case 2:
					for(i=0;i<cnt;i++) {
					System.out.println(a[i].name);
					System.out.println(a[i].address);
					System.out.println(a[i].Tel);
					}
					break;
				
			case 3:
					System.out.println("종료");
					flag=false;
					break;
			}
		}

	}

}
