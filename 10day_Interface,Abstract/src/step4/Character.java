package step4;

public abstract class Character {
	protected int hp,energy,level=0;			// ĳ������ ������ �Ǵ� �Ӽ� 3������ �θ�ü�� ������ ����
						
	
	public abstract void eat();			//  �߻� �޼���� ��ü,������ x
	
	public abstract void sleep();
	
	public abstract boolean play();
	
	public abstract boolean train();
	
	public abstract void levelUp();
	
	public boolean checkEnergy() {	// �Ϲ� �޼���� ������ ������, energy���� üũ�ϴ� �޼���,
		if(energy <=0) {
			return true;
		}else {
			return false;
		}
	}
	public void printInfo() {		// ���� ĳ������ �Ӽ��鿡���� �������� ��� ���ִ� �޼���
		System.out.println("���� ĳ������ ���� ���");
		System.out.println("HP ="+hp);
		System.out.println("ENERGY ="+energy);
		System.out.println("LEVEL ="+level);
	}
	
	
}
