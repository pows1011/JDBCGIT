package er;

import java.io.File;
import java.io.IOException;

public class Ch811 {

	public static void main(String[] args) {

		try {
			File f = creatfile("");
			System.out.println(f.getName() + "������ ���������� ����");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է�");
		}
		

	}

	private static File creatfile(String fileName) //throws Exception
	{
		try {
			if(fileName==null || fileName.equals(""))
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�");
		}catch(Exception e) {
			fileName="�������.txt";	
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
