package step5;

public class TestInterFace1 {
	public static void main(String[] args) {
		
		//�������̽� -> ������������ -> ������ ���밡�� -> ǥ��ȭ
		//���� �������̽� Ÿ�� ������ ���� ��ü ���� ����
		
		Flyer f1=new Bird();
		Flyer f2=new SuperMan();
		//Flyer �������̽� Ÿ���� �迭�� ������ü�� �߰� ����
		Flyer fa[] = {f1,f2};
		for(int i=0;i<fa.length;i++) {
			fa[i].fly();
			System.out.println(f1 instanceof Flyer);
			
		}
	}
}
