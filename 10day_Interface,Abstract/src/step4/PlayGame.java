package step4;

import java.util.Scanner;

public class PlayGame {						// 서비스에서 이용될 변수 3가지 선언 
	private Character cha;					// 서비스이기 떄문에 상속은 받지않고 Character클래스를 객체로 사용하기 위해 변수로 선언
	private int menu;						// 각각 메뉴의 선택에따른 기능을 수행하기 위한 번호를 받아오는 값
	private boolean exit;					// 기능의 종료를 하기 위한 값
	
	public PlayGame(Character cha) {
		this.cha=cha;						// 생성자로 기본값 초기화
	}
	
	public void printMenu(Scanner sc) {		// 메뉴의 선택을 위해 스캐너를 매개변수로 선언
		System.out.println("1.밥먹기 2.잠재우기 3.놀아주기 4.운동하기 5.종료");
		menu=sc.nextInt();
		play();
	}
	
	public void play() {
		
		switch(menu) {
		case 1:
			cha.eat();
			break;
		case 2:
			cha.sleep();
			break;
		case 3:
			exit=cha.play();
			break;
		case 4:
			exit=cha.train();
			break;
		case 5:
			exit=true;
			break;
			
			default:
				exit=true;
				break;
			
		}
		cha.printInfo();
	}

	public Character getCha() {
		return cha;
	}

	public void setCha(Character cha) {
		this.cha = cha;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
	
	 
		
	
	
	
	
	
	
	
}
