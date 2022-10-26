package step10;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
	
	
	
	public TreeSet getLottoSet() { 
		Random r=new Random();
		TreeSet set=new TreeSet();
		
		while(set.size()<6) {
			set.add(r.nextInt(45)+1);
			
		}
			
		return set;
		
	}
	
}
