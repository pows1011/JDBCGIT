package step9;

public class Person {
	//DTO �Ǵ� VOŬ���� (������ ���ÿ� ���) ���м�(�����ڸ� ���� ���������� ������ ������)
	// ���� ������ ���������� private�� ���ؼ� �����ְ�
	//public �޼��带 ���ؼ� ���������� ����ϴ� ���
	//�����ڴ� 1�� �ʱ�ȭ�ϸ� ����. ��ü�� �����Ǹ� �ڵ����� ���������� �����ڴ� ����� �ִ°� ����
	//Setter�� �ݺ����� �� �Է¿� �ʿ���
	private String name;
	private int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
