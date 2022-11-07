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
		String id = "", pwd = ""; // "" �������� �ʱ�ȭ , null ( �� �޸� ��� ���� )
		boolean flag = true, loginflag = false;
		Member m = null;

		while (flag) {
			System.out.println("1.ȸ�� ���� 2.�� �������� 3.�α��� 4.�α� �ƿ� 5.Ż�� 6.����");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				if (loginId.equals("") || loginId == null) {
					m = new Member();
					System.out.println("�߰��Ϸ��� ���̵� �� �Է�");
					m.setId(sc.next());
					System.out.println("�߰��Ϸ��� ��й�ȣ �Է�");
					m.setPwd(sc.next());
					System.out.println("�߰��Ϸ��� �̸� �Է�");
					m.setName(sc.next());
					System.out.println("�߰��Ϸ��� �̸��� �Է�");
					m.setEmail(sc.next());
					service.addMember(m);
				} else {
					System.out.println("�α����� �Ǿ� �ֽ��ϴ�.");
				}

				break;
			case 2:
				if (!loginId.equals("") && loginId != null) {
					m = new Member();
					m = service.getMember(loginId);
					System.out.println(m);
					System.out.println("�����Ϸ��� ��й�ȣ");
					m.setPwd(sc.next());
					System.out.println("�����Ϸ��� �̸���");
					m.setEmail(sc.next());
					boolean f = service.editMemberInfo(m);
					if (f) {
						System.out.println("�����Ϸ�");

					}
				} else {
					System.out.println("�α��� �ϼ���");
				}

				break;
			case 3:
				if (loginId.equals("") || loginId == null) {
					System.out.println("�α����Ϸ��� ���̵� �Է�");
					id = sc.next();
					System.out.println("��й�ȣ �Է�");
					pwd = sc.next();
					loginflag = service.login(id, pwd);
					if (loginflag) {
						loginId = id;
						System.out.println(id + "�� �α��� ����");
					} else {
						System.out.println("�α��� ����");
					}
				} else {
					System.out.println("�̹� �α��� �Ǿ� �ֽ��ϴ�");
				}

				break;
			case 4:
				if (!loginId.equals("") && loginId != null) {
					loginId = "";
					System.out.println("�α� �ƿ��� �Ǿ����ϴ�.");
				} else {
					System.out.println("�α����� �Ǿ� ���� �ʽ��ϴ�.");
				}

				break;
			case 5:
				if (!loginId.equals("") && loginId != null) {
					boolean f = service.removeMember(loginId);
					if (f) {
						System.out.println("���� �Ϸ�");
						loginId = "";
					}
				} else {
					System.out.println("�α����� �ϼ���");
				}

				break;
			case 6:
				System.out.println("�ý�������");
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
				System.out.println("1.�߰� 2.�˻� 3.��ü ��� 4.���� 5.���� 6.����");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					Board b = new Board();
					b.setWriter(loginId);
					System.out.println("�н����� �Է�");
					b.setPwd(sc.next());
					System.out.println("���� �Է�");
					sc.nextLine(); // ���� ��
					b.setTitle(sc.nextLine());
					System.out.println("���� �Է�");
					b.setContent(sc.nextLine());
					service.write(b);
					break;
				case 2:
					System.out.println("ã������ �Խñ��� ��ȣ �Է�");
					int num = sc.nextInt();
					b = service.getArticle(num);
					if (b != null) {
						System.out.println(b);
					} else {
						System.out.println("���� ���Դϴ�");
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
					System.out.println("������ ���� ��ȣ");
					b.setNum(sc.nextInt());
					System.out.println("���ο� �н�����");
					b.setPwd(sc.next());
					System.out.println("���ο� ���� �Է�");
					sc.nextLine();
					b.setTitle(sc.nextLine());
					System.out.println("���ο� ���� �Է�");
					b.setContent(sc.nextLine());
					service.editArticle(b);

					break;
				case 5:

					System.out.println("������ ��ȣ �Է�");
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
			System.out.println("�α��� �ϼ���");
		}
	}

	public static void func3(Scanner sc, product.Service service) {
		int menu = 0, num = 0;
		String name = "";
		boolean flag = true;
		Product p = null;

		if (!loginId.equals("") && loginId != null) {
			while (flag) {
				System.out.println("1.��ǰ��� 2.��ǰ��ȣ�ΰ˻� 3.��ǰ�����ΰ˻� 4.��ǰ���� 5.��ǰ��� 6.��ǰ���� 7.����");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					p= new Product();
					System.out.println("����� ��ǰ�� �̸� �Է�");
					
					p.setName(sc.next());
					System.out.println("����� ��ǰ�� ���� �Է�");
					sc.nextLine();
					p.setPrice(sc.nextInt());
					System.out.println("����� ��ǰ�� ���� �Է�");
					p.setQuantity(sc.nextInt());
					p.setId(loginId);					
					service.addProduct(p);
					
					break;
				case 2:
					System.out.println("�˻��� ��ǰ�� ��ȣ �Է�");
					num=sc.nextInt();
					p=service.getByNum(num);
					if(p!=null) {
						System.out.println(p);
					}
					
					break;
				case 3:
					
					System.out.println("�˻��� ��ǰ�� �̸� �Է�");
					name=sc.next();
					p=service.getByName(name);
					if(p!=null) {
						System.out.println(p);
					}
					
					break;
				case 4:
					p= new Product();
					System.out.println("������ ��ǰ�� ��ǰ��ȣ �Է�");
					p.setNum(sc.nextInt());			
					System.out.println("������ ��ǰ�� �̸� �Է�");
					p.setName(sc.next());
					System.out.println("������ ��ǰ�� ���� �Է�");
					p.setPrice(sc.nextInt());
					System.out.println("������ ��ǰ�� ���� �Է�");
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
					System.out.println("���� �Ϸ��� ��ǰ�� ��ǰ��ȣ �Է�");
					num=sc.nextInt();
					service.delProduct(num);
					
					break;
				case 7:
					flag = false;
				}
			}
		} else {
			System.out.println("�α��� �ϼ���");
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
			System.out.println("1.ȸ�� ���� 2.�Խ��� 3.â�� 4.����");
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

