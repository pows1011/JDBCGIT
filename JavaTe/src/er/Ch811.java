package er;

import java.io.File;
import java.io.IOException;

public class Ch811 {

	public static void main(String[] args) {

		try {
			File f = creatfile("");
			System.out.println(f.getName() + "파일이 성공적으로 생성");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" 다시 입력");
		}
		

	}

	private static File creatfile(String fileName) //throws Exception
	{
		try {
			if(fileName==null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다");
		}catch(Exception e) {
			fileName="제목없음.txt";	
		}
		
		
		
		File f=new File(fileName);
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return f;
	}
}
