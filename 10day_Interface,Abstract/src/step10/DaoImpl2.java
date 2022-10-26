package step10;

public class DaoImpl2 implements Dao {

	private int index;
	private MemberVO p[]=new MemberVO[10];
	
	@Override
	public void addPerson(MemberVO p) {
			this.p[index]=p;
			index++;

	}

	@Override
	public void connect() {
		System.out.println("DaoImpl2¿Ã ¡¢º”");

	}

	@Override
	public MemberVO findPerson(String name) {
		MemberVO per=null;
		for(int i=0;i<index;i++) {
			
			if(p[i].getName().equals(name)) {
				per=p[i];
			}
		}
		
		return per;
	}

	@Override
	public void printAll() {
		for(int i=0;i<index;i++) {
			System.out.println(p[i]);
		}

	}
}
