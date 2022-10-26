package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public void go() throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(5432);
		System.out.println("*** ���� ������ ***");
		//������������ ��Ʈ�� �����ְ� 
		
		try {
			while(true) {
				//����ϴٰ� Ŭ���̾�Ʈ�� �����ϸ� ����ȴ�. �Ϲ� ������ ��ȯ�Ѵ�.
				//Ŭ���̾�Ʈ�� �Ϲݼ����̶� ��ȭ�Ѵ�.
				// Socket�� ���� ���� 
				Socket socket=serverSocket.accept();
				InputStream is=socket.getInputStream();
				InputStreamReader ir=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(ir);
				try {
					System.out.println(socket.getInetAddress()+"���� ��"+br.readLine());
				}catch(IOException ie) {
					System.out.println(socket.getInetAddress()+"�� �����͸� ���� ������ �߻�...");
				}	
				
				br.close();
				socket.close();
			}
		} finally{
			if(serverSocket!=null) {
				serverSocket.close();
			}
		}

	}

	public static void main(String[] args) throws IOException {

		
		TestServer ts=new TestServer();
		
		try {
			ts.go();
		}catch (IOException ie) {
			ie.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
