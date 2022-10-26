package step4;

import java.util.Scanner;

public class PlayGame {						// ���񽺿��� �̿�� ���� 3���� ���� 
	private Character cha;					// �����̱� ������ ����� �����ʰ� CharacterŬ������ ��ü�� ����ϱ� ���� ������ ����
	private int menu;						// ���� �޴��� ���ÿ����� ����� �����ϱ� ���� ��ȣ�� �޾ƿ��� ��
	private boolean exit;					// ����� ���Ḧ �ϱ� ���� ��
	
	public PlayGame(Character cha) {
		this.cha=cha;						// �����ڷ� �⺻�� �ʱ�ȭ
	}
	
	public void printMenu(Scanner sc) {		// �޴��� ������ ���� ��ĳ�ʸ� �Ű������� ����
		System.out.println("1.��Ա� 2.������ 3.����ֱ� 4.��ϱ� 5.����");
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
