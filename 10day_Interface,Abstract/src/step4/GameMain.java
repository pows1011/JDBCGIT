package step4;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);		
		Character cha=null;
		PlayGame pg=null;
		System.out.println("���ϴ� ĳ���͸� �����ϼ��� \n 1. ��ī�� 2. ���α� 3. �̻��ؾ�");
		int x=sc.nextInt();
			switch(x) {
			case 1:
				cha=new Picachu();
		
				break;
				
			case 2:
				cha=new Gobook();
				break;
			case 3:
				cha=new Lee();
				break;
				
				default:
					System.out.println("�߸��� ���� �Դϴ�");
					break;
			
			}
			
			
			if(cha==null) {
				System.out.println("������ ���� �մϴ�.");
				return ;
			}else {
				pg=new PlayGame(cha);
				while(true) {
					pg.printMenu(sc);
					if(pg.isExit()) {
						System.out.println("���� �մϴ�");
						break;
					}
				}
				
			}
			

		

	}

}
