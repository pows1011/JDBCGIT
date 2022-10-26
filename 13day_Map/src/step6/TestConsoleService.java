package step6;

import java.io.IOException;

public class TestConsoleService {
	public static void main(String[] args) {
		
		ConsoleService service=new ConsoleService();
		
		String fileName="C:\\java-kosta\\iotest\\step3\\order.txt";
		
		
		try {
			service.order(fileName);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
