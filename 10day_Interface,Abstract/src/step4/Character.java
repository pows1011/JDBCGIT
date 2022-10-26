package step4;

public abstract class Character {
	protected int hp,energy,level=0;			// 캐릭터의 공통이 되는 속성 3가지를 부모객체에 변수로 선언
						
	
	public abstract void eat();			//  추상 메서드라서 객체,내용이 x
	
	public abstract void sleep();
	
	public abstract boolean play();
	
	public abstract boolean train();
	
	public abstract void levelUp();
	
	public boolean checkEnergy() {	// 일반 메서드라서 내용이 존재함, energy값을 체크하는 메서드,
		if(energy <=0) {
			return true;
		}else {
			return false;
		}
	}
	public void printInfo() {		// 현재 캐릭터의 속성들에대한 정보값을 출력 해주는 메서드
		System.out.println("현재 캐릭터의 정보 출력");
		System.out.println("HP ="+hp);
		System.out.println("ENERGY ="+energy);
		System.out.println("LEVEL ="+level);
	}
	
	
}
