package step8;

interface A{
	public void a();
}
interface B extends A{
	public void b();
	//인터페이스 끼리는 상속이 가능하다.
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
	
	//여러개의 인터페이스를 implements가능하고
	//이 경우 모든 추상 메서드를 다 구현해야 한다.
}


class F extends E{
	
}

public class TestInterface4 {

	public static void main(String[] args) {
		
		C c= new C();
		A a= c;
		a.a();//A타입 까지만 인식가능
		
		B b=c;
		b.a();
		b.b();//A와 B타입 모두 인식가능
		
		
		A af=new F();
		B bf=new F();
		D df=new F();
		//특정 인터페이스를 implements한 클래스를 
		//상속받은 F는 부모E가 구현한 타입으로
		//모두 다 처리 가능하다.
		
		
	}

}
