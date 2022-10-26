package step8;

import java.util.Scanner;

public class AddrMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String name=null;
		String Tel=null;
		String address=null;
		int i=0,j,c;	//반복을 하기위한 i,j값 선언  c는 메뉴의 선택값을 전달하기 위한용도
		boolean flag=true;
					//while문의 반복 여부 설정을 위한ㅂ녀수
		
		Addr[] a=new Addr[10];
		
		
		while(flag) {
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 전체출력");
			System.out.println("4. 수정");
			System.out.println("5. 시작");
			System.out.println("6. 종료");
			c=sc.nextInt();
			
			switch(c) {
				
			case 1:
				a[i]=new Addr();				//Addr 클래스 안의 객체변수에 값을 넣어주기 위해 a[i]배열의 객체를 선언해줌
				a[i].add(name, Tel, address, sc);
				i++;							//for문을 사용할경우 계속반복되기 때문에 1명씩 하나하나의 데이터를 받아오기 위한 카운팅
				System.out.println("count 값"+i);
				break;
			case 2:
				System.out.println("검색할 이름 입력");
				name=sc.next();	// 검색할 때 사용할 name값을 받아옴
				flag=false;	// flag의 값을 false로 설정해서 값이 없다면 반복이 되지않게 변경
				for(j=0;j<i;j++) {	// i는 메인전체에서 사용할수있게 전역변수로 상단에 설정해놨기 떄문에 i값은 초기화가 되지않음 그래서등록 횟수만큼 증가해있는 상태
					flag=a[j].search(name); //flag를 클래스의 search메소드에 할당 존재한다면 true 반환 
						if(flag) { // flag가 true라면 print메소드를 반환해서 출력
							a[j].print();
							break;
						}
				}if(!flag) {
					System.out.println("찾는 값이 없습니다.");
				}
				
				break;
			case 3:
				
				for(j=0;j<i;j++) { // 전역변수 i 만큼의 반복 (i는 아이디 생성시 같이올라감 그러므로 값이 존재하는 배열의 갯수와 같다
					a[j].print();
				}
				break;
			case 4:
				System.out.println("수정할 이름 입력:"); // 수정할 사람의 이름을 받음
				name=sc.next();
				System.out.println("번호를 입력하세요");	// 변경할 번호 값을 입력
				Tel=sc.next();
				System.out.println("주소를 입력하세요");	// 변경할 주소값을 입력
				address=sc.next();
				
				boolean f=false;			// search와 마찬가지로 f 의값을 false로 선언시켜 전체가 false라면 반복 x
				
				for(j=0;j<i;j++) {
					f=a[j].edit(name,Tel,address); //edit메소드에 입력한 3개의 값을 보내줌
					if(f) {				// 위의 메소드가 작동후 맞다면 true값 반환 break;
						break;
					}
					}
				
				if(f==false) {
					System.out.println("찾는 이름이 없습니다");
				}
				break;
			case 5:
				break;
			case 6:
				flag=false;
				break;
			}
		
		}
	}

}
