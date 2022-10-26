package step4;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);		
		Character cha=null;
		PlayGame pg=null;
		System.out.println("원하는 캐릭터를 선택하세요 \n 1. 피카츄 2. 꼬부기 3. 이상해씨");
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
					System.out.println("잘못된 선택 입니다");
					break;
			
			}
			
			
			if(cha==null) {
				System.out.println("게임을 종료 합니다.");
				return ;
			}else {
				pg=new PlayGame(cha);
				while(true) {
					pg.printMenu(sc);
					if(pg.isExit()) {
						System.out.println("종료 합니다");
						break;
					}
				}
				
			}
			

		

	}

}
