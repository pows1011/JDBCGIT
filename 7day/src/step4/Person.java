package step4;

public class Person {
	private String name;
	private Car car;	//car��� �����տ� Car ��� Ŭ������
	//Car��ü�� �ּҰ��� ��� ���� car �����ϰ�
	//������ ������ Ÿ���� Ŭ���� ���� �ȴ�.
	//��ü�� �����Ҷ� car�� �ּҰ��� person���� �����ش�.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;//��ü�� �ּҰ� ��
	}
	
	
	
}
