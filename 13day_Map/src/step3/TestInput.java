package step3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput {
	public static void main(String[] args) {
			
		
//		FileReader (2byte)
//		FileWriter 
//		InputStream() 
//		OutputStream
//		InputStreamReader

		try {
			FileReader fr=new FileReader("C:\\java-kosta\\output4.txt");
			BufferedReader br=new BufferedReader(fr);
			String str=br.readLine();
			while(str!=null) {
				System.out.println(str);
				str=br.readLine();
			}
			br.close();
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
