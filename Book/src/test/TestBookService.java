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
				System.out.println("1.�߰� 2. �˻� 3.���� 4.���� 5.���  6.����");
				i=sc.nextInt();
				switch(i) {
				case 1:
					System.out.println("�߰��� ���̵�");
					String id=sc.next();
					System.out.println("�߰��� ������ �̸� ");
					String author=sc.next();
					System.out.println("�߰��� å�� ����");
					String title=sc.next();
					System.out.println("�߰��� å�� ������");
					String publisher=sc.next();
					System.out.println("å�� ����");
					int price=sc.nextInt();
					service.insert(new BookVO(id,author,title,publisher,price));
					break;
				case 2:
					System.out.println("ã������ å�� ID");
					id=sc.next();
					BookVO b=service.search(id);
					System.out.println(b);
					break;
				case 3:
					System.out.println("�����Ϸ��� å�� ���̵�");
					 id=sc.next();
					System.out.println("���� �� å�� ����");
					author=sc.next();
					System.out.println("���� ��  å�� ����");
					title=sc.next();
					System.out.println("���� ��  å�� ������");
					publisher=sc.next();
					System.out.println("���� ��  å�� ����");
					price=sc.nextInt();
					service.update(new BookVO(id,author,title,publisher,price));
					break;
				case 4:
					System.out.println("������ ���̵��Է�");
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
