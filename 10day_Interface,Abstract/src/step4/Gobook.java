package step4;

public class Gobook extends Character{
		
	public Gobook() {
		hp=40;
		energy=50;
		System.out.println("꼬북이가 생성 되었습니다");
		printInfo();
	}
	
	
	@Override
	public void eat() {			// 각각의 추상메서드를 부모객체로부터 상속받아 오버라이드 시켜 그 값을 입력또는 수정 해주는 메서드
		energy+=15;
	}
	@Override
	public void sleep() {
		
		energy+=10;
		
	}
	@Override
	public boolean play() {
		
			energy-=30;
			hp+=15;			
			levelUp();
			
		return checkEnergy();
		
		
	}
	@Override
	public boolean train() {
		energy-=20;
		hp+=30;			
		levelUp();
		return checkEnergy();
	}
	@Override
	public void levelUp() {
		if(50 <= hp) {
			level++;
			hp-=50;
		}
		
	}
}
