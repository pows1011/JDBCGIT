package step2;


	abstract class Vehicle{
		public void go() {
			System.out.println("go");
			
		}
		
		public abstract void fuel();
	}
	
	
	class Truck extends Vehicle{

		@Override
		public void fuel() {
			// TODO Auto-generated method stub
			System.out.println("경유 주입");
		}
		
	}


public class TestAbstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Truck();
		v.go();
		v.fuel();
		
		
	}

}
