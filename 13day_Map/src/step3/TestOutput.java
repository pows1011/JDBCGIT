package step3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("C:\\java-kosta\\output4.txt");
			PrintWriter pw=new PrintWriter(fw,true);//���� 
			pw.println("ũ����Ż");
			System.out.println("������ ���");
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
