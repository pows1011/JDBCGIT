package test;

import java.util.ArrayList;
import java.util.Scanner;

import service.BookService;
import vo.BookVO;

public class TestBookService {
		public static void main(String[] args) {
			BookService service=new BookService();
			boolean flag=true;
			int i=0;
			Scanner sc =new Scanner(System.in);
			ArrayList<BookVO> vo=new ArrayList<>();
			
			while(flag) {
				System.out.println("1.추가 2. 검색 3.수정 4.삭제 5.출력  6.종료");
				i=sc.nextInt();
				switch(i) {
				case 1:
					System.out.println("추가할 아이디");
					String id=sc.next();
					System.out.println("추가할 저자의 이름 ");
					String author=sc.next();
					System.out.println("추가할 책의 제목");
					String title=sc.next();
					System.out.println("추가할 책의 발행자");
					String publisher=sc.next();
					System.out.println("책의 가격");
					int price=sc.nextInt();
					service.insert(new BookVO(id,author,title,publisher,price));
					break;
				case 2:
					System.out.println("찾으려는 책의 ID");
					id=sc.next();
					BookVO b=service.search(id);
					System.out.println(b);
					break;
				case 3:
					System.out.println("수정하려는 책의 아이디");
					 id=sc.next();
					System.out.println("수정 될 책의 저자");
					author=sc.next();
					System.out.println("수정 될  책의 제목");
					title=sc.next();
					System.out.println("수정 될  책의 발행자");
					publisher=sc.next();
					System.out.println("수정 될  책의 가격");
					price=sc.nextInt();
					service.update(new BookVO(id,author,title,publisher,price));
					break;
				case 4:
					System.out.println("삭제할 아이디입력");
					id=sc.next();
					service.delete(id);
					break;
				case 5:
					vo=service.printAll();
					//service.printAll();					
					
					for(int k=0;k<vo.size();k++) {
						System.out.println(vo.get(k));
					}
					break;
				case 6:
					flag=false;
					break;
					default:
						flag=false;
						break;
						
				}
				
			}
		
		}
}
