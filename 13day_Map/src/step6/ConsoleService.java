package step6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleService {

	public void order(String fileName) throws IOException {
		File file = new File(fileName);

		file.getParentFile().mkdirs();

		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);

		BufferedReader br = new BufferedReader(ir);

		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw=new PrintWriter(fw,true);
		
		
		while(true) {
			System.out.println("저넉 메뉴를 입력");
			String str=br.readLine();
			if(str.equals("주문")) {
				System.out.println("주문이 완료 되었습니다");
				break;
			}
			pw.println(str);
			System.out.println("내용 :"+str);
		}
		pw.close();
		br.close();
		
	}
	
	
}
