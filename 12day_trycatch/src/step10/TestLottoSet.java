package step10;

import java.util.TreeSet;

public class TestLottoSet {

	public static void main(String[] args) {
		
		LottoService service=new LottoService();
		TreeSet set=service.getLottoSet();
		System.out.println(set);
		

		
	}

}
