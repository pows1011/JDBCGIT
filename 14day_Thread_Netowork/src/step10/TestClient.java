package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class TestClient {

	private Socket socket;
	private BufferedReader sysbr;// 콘솔로부터 입력 받는 스트림
	private BufferedReader serverBr; // 서버에서 오는 데이터를 입력 받는 스트림
	private PrintWriter pw; // 서버에 데이터를 출력하는 스트림

	public void go() throws IOException, UnknownHostException {

		try {
			socket = new Socket("localhost", 5432);

			sysbr = new BufferedReader(new InputStreamReader(System.in));
			serverBr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);

			while (true) {

				String mess = sysbr.readLine();
				if (mess.equals("exit")) {
					System.out.println("작업 종료");
					break;
				}
				pw.println(mess);
				System.out.println(serverBr.readLine());
			}
		} finally {
			closeAll();
		}
	}

	public void closeAll() throws IOException {
		if (pw != null) {
			pw.close();
		}
		if (sysbr != null) {
			sysbr.close();
		}
		if (serverBr != null) {
			serverBr.close();

		}
		if (socket != null) {
			socket.close();
		}

	}

	public static void main(String[] args) {
		TestClient ts=new TestClient();
		try {
			ts.go();
		}catch(UnknownHostException ue) {
			ue.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
