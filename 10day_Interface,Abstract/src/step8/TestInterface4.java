package step8;

interface A{
	public void a();
}
interface B extends A{
	public void b();
	//�������̽� ������ ����� �����ϴ�.
}

class C implements B{
	
	
	@Override
	public void a() {
		System.out.println("a");
		
	}@Override
	public void b() {
		System.out.println("b");
		
	}
}

interface D{
	public void d();
	
}

class E implements B,D{
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}
	
	//�������� �������̽��� implements�����ϰ�
	//�� ��� ��� �߻� �޼��带 �� �����ؾ� �Ѵ�.
}


class F extends E{
	
}

public class TestInterface4 {

	public static void main(String[] args) {
		
		C c= new C();
		A a= c;
		a.a();//AŸ�� ������ �νİ���
		
		B b=c;
		b.a();
		b.b();//A�� BŸ�� ��� �νİ���
		
		
		A af=new F();
		B bf=new F();
		D df=new F();
		//Ư�� �������̽��� implements�� Ŭ������ 
		//��ӹ��� F�� �θ�E�� ������ Ÿ������
		//��� �� ó�� �����ϴ�.
		
		
	}

}
