package step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			String id,name,number,address;
			
			id=null;
			name=null;
			number=null;
			address=null;
			
			boolean boo=true;
			
			while(boo) {
				System.out.println("1.등록");
				System.out.println("2.전체 출력");
				System.out.println("3.종료");
				int b=sc.nextInt();
				switch(b) {
				case 1:
					System.out.println("아이디를 입력해주세요");
					id=sc.next();
					System.out.println("이름을 입력해주세요");
					name=sc.next();
					System.out.println("번호를 입력해주세요");
					number=sc.next();
					System.out.println("주소를 입력해주세요");
					address=sc.next();
					break;
				case 2:
					System.out.println("아이디:"+id+","+" 이름:"+name+","+" 번호: "+number+","+"주소 :"+address);
					break;
				case 3:
					System.out.println("종료");
					boo=false;
					break;
				
				}
				
			}
			
				
		
	}

}
