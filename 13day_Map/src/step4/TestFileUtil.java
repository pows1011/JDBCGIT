package step4;

import java.io.IOException;

public class TestFileUtil {
	public static void main(String[] args) {
		
		
		FileUtil fu=new FileUtil();
		String fileName="C:\\java-kosta\\iotest\\step1\\data.txt";
		
		
		try {
			fu.writeData(fileName,"ABC");
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		try {
			fu.readFile(fileName);
		}catch(IOException e) {
			e.printStackTrace();
		}
		String destName="C:\\java-kosta\\iotest\\step2\\copy_data.txt";
		
		try {
			fu.copyFile(fileName, destName);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
