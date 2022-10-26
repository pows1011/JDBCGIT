package step9;

public class DbMain {
	public static void main(String[] args) {
		Process pro1=new Process(new MsImpl());
		Process pro2=new Process(new OracleImpl());
		
		pro1.connect();
		pro1.delete();
		pro1.insert();
		pro1.select();
		pro1.update();
		System.out.println("------------------ ");
		pro2.connect();
		pro2.delete();
		pro2.insert();
		pro2.select();
		pro2.update();
	}
}
