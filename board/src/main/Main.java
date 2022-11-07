package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import board.Board;
import join.Member;
import product.Product;

public class Main {

	public static String loginId = "";

	public static void func1(Scanner sc, join.Service service) {

		int menu = 0;
		String id = "", pwd = ""; // "" 공백으로 초기화 , null ( 힙 메모리 사용 안함 )
		boolean flag = true, loginflag = false;
		Member m = null;

		while (flag) {
			System.out.println("1.회원 가입 2.내 정보수정 3.로그인 4.로그 아웃 5.탈퇴 6.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				if (loginId.equals("") || loginId == null) {
					m = new Member();
					System.out.println("추가하려는 아이디 값 입력");
					m.setId(sc.next());
					System.out.println("추가하려는 비밀번호 입력");
					m.setPwd(sc.next());
					System.out.println("추가하려는 이름 입력");
					m.setName(sc.next());
					System.out.println("추가하려는 이메일 입력");
					m.setEmail(sc.next());
					service.addMember(m);
				} else {
					System.out.println("로그인이 되어 있습니다.");
				}

				break;
			case 2:
				if (!loginId.equals("") && loginId != null) {
					m = new Member();
					m = service.getMember(loginId);
					System.out.println(m);
					System.out.println("수정하려는 비밀번호");
					m.setPwd(sc.next());
					System.out.println("수정하려는 이메일");
					m.setEmail(sc.next());
					boolean f = service.editMemberInfo(m);
					if (f) {
						System.out.println("수정완료");

					}
				} else {
					System.out.println("로그인 하세요");
				}

				break;
			case 3:
				if (loginId.equals("") || loginId == null) {
					System.out.println("로그인하려는 아이디 입력");
					id = sc.next();
					System.out.println("비밀번호 입력");
					pwd = sc.next();
					loginflag = service.login(id, pwd);
					if (loginflag) {
						loginId = id;
						System.out.println(id + "님 로그인 성공");
					} else {
						System.out.println("로그인 실패");
					}
				} else {
					System.out.println("이미 로그인 되어 있습니다");
				}

				break;
			case 4:
				if (!loginId.equals("") && loginId != null) {
					loginId = "";
					System.out.println("로그 아웃이 되었습니다.");
				} else {
					System.out.println("로그인이 되어 있지 않습니다.");
				}

				break;
			case 5:
				if (!loginId.equals("") && loginId != null) {
					boolean f = service.removeMember(loginId);
					if (f) {
						System.out.println("삭제 완료");
						loginId = "";
					}
				} else {
					System.out.println("로그인을 하세요");
				}

				break;
			case 6:
				System.out.println("시스템종료");
				flag = false;
				break;
			default:
				flag = false;
				break;

			}
		}

	}

	public static void func2(Scanner sc, board.Service service) {
		int menu = 0;
		String id = "";
		boolean flag = true;

		if (!loginId.equals("") && loginId != null) {
			while (flag) {
				System.out.println("1.추가 2.검색 3.전체 출력 4.수정 5.삭제 6.종료");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					Board b = new Board();
					b.setWriter(loginId);
					System.out.println("패스워드 입력");
					b.setPwd(sc.next());
					System.out.println("제목 입력");
					sc.nextLine(); // 공백 제
					b.setTitle(sc.nextLine());
					System.out.println("내용 입력");
					b.setContent(sc.nextLine());
					service.write(b);
					break;
				case 2:
					System.out.println("찾으려는 게시글의 번호 입력");
					int num = sc.nextInt();
					b = service.getArticle(num);
					if (b != null) {
						System.out.println(b);
					} else {
						System.out.println("없는 글입니다");
					}
					break;
				case 3:
					ArrayList<Board> list = (ArrayList<Board>) service.getArticles();
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
					break;
				case 4:
					b = new Board();
					System.out.println("수정할 글의 번호");
					b.setNum(sc.nextInt());
					System.out.println("새로운 패스워드");
					b.setPwd(sc.next());
					System.out.println("새로운 제목 입력");
					sc.nextLine();
					b.setTitle(sc.nextLine());
					System.out.println("새로운 내용 입력");
					b.setContent(sc.nextLine());
					service.editArticle(b);

					break;
				case 5:

					System.out.println("삭제할 번호 입력");
					int ab = sc.nextInt();
					service.delArticle(ab);

					break;
				case 6:
					flag = false;
					break;
				default:
					break;

				}
			}
		} else {
			System.out.println("로그인 하세요");
		}
	}

	public static void func3(Scanner sc, product.Service service) {
		int menu = 0, num = 0;
		String name = "";
		boolean flag = true;
		Product p = null;

		if (!loginId.equals("") && loginId != null) {
			while (flag) {
				System.out.println("1.제품등록 2.제품번호로검색 3.제품명으로검색 4.제품수정 5.제품목록 6.제품삭제 7.종료");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					p= new Product();
					System.out.println("등록할 제품의 이름 입력");
					
					p.setName(sc.next());
					System.out.println("등록할 제품의 가격 입력");
					sc.nextLine();
					p.setPrice(sc.nextInt());
					System.out.println("등록할 제품의 수량 입력");
					p.setQuantity(sc.nextInt());
					p.setId(loginId);					
					service.addProduct(p);
					
					break;
				case 2:
					System.out.println("검색할 제품의 번호 입력");
					num=sc.nextInt();
					p=service.getByNum(num);
					if(p!=null) {
						System.out.println(p);
					}
					
					break;
				case 3:
					
					System.out.println("검색할 제품의 이름 입력");
					name=sc.next();
					p=service.getByName(name);
					if(p!=null) {
						System.out.println(p);
					}
					
					break;
				case 4:
					p= new Product();
					System.out.println("수정할 제품의 제품번호 입력");
					p.setNum(sc.nextInt());			
					System.out.println("수정할 제품의 이름 입력");
					p.setName(sc.next());
					System.out.println("수정할 제품의 가격 입력");
					p.setPrice(sc.nextInt());
					System.out.println("수정할 제품의 수량 입력");
					p.setQuantity(sc.nextInt());						
					service.editProduct(p);					
					
					break;
				case 5:
					ArrayList<Product> list=new ArrayList<>();
					list=service.getAll();
					for(int i=0;i<list.size();i++) {
						System.out.println(list.get(i));
					}
					
					break;
				case 6:
					System.out.println("삭제 하려는 제품의 제품번호 입력");
					num=sc.nextInt();
					service.delProduct(num);
					
					break;
				case 7:
					flag = false;
				}
			}
		} else {
			System.out.println("로그인 하세요");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		join.Service joinService = new join.ServiceImpl();
		board.Service boardService = new board.ServiceImpl();
		product.Service productService = new product.ServiceImpl();
		int menu = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("1.회원 관리 2.게시판 3.창고 4.종료");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				func1(sc, joinService);
				break;
			case 2:
				func2(sc, boardService);
				break;
			case 3:
				func3(sc, productService);
				break;
			case 4:
				flag = false;
				break;
			default:
				flag = false;
				break;
			}
		}

	}
}

