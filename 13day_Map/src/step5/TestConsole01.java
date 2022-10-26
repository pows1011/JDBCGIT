package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestConsole01 {
	public static void main(String[] args) {
		
		
		InputStream is=System.in;
		
		InputStreamReader ir=new InputStreamReader(is);
		
		BufferedReader br=new BufferedReader(ir);
		
		try {
			while(true) {
				System.out.println("입력");
				String str=br.readLine();
				if(str.equals("그만")) {
					
					break;
				}
				System.out.println("내용 :"+str);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}