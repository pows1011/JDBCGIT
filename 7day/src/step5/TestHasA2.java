package step5;

public class TestHasA2 {

	public static void main(String[] args) {
		//Notebook note=new Notebook("Ra-1",300);
		
		Engineer eng=new Engineer("����",new Notebook("��", 100));
		
		System.out.println(eng.getName());
		System.out.println(eng.getNotebook().getModel());
		System.out.println(eng.getNotebook().getPrice());
		
		
		eng.getNotebook().setModel("�Ｚ");
		eng.getNotebook().setPrice(200);
		
		System.out.println();
		System.out.println(eng.getNotebook().getModel());
		System.out.println(eng.getNotebook().getPrice());
		
		
	}

}
