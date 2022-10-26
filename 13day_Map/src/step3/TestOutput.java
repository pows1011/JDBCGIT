package step3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("C:\\java-kosta\\output4.txt");
			PrintWriter pw=new PrintWriter(fw,true);//누적 
			pw.println("크리스탈");
			System.out.println("데이터 기록");
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
