package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TestServer {

	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public void go() throws IOException {
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("*** 서버 작동 ***");
			socket = serverSocket.accept();
			String ip = socket.getInetAddress().toString();// socket에서 들어오는 IP의 값을 반환

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);

			while (true) {
				try {
					String mess = br.readLine();
					if (mess == null) {
						System.out.println("작업 종료");
						break;
					}
					System.out.println(ip + "님" + mess);
					pw.println(mess + " server");
				} catch (SocketException se) {
					System.out.println("작업 종료");
					break;
				}
			}
		} finally {
			closeAll();
		}
	}

	public void closeAll() throws IOException {
		if (pw != null) {
			pw.close();
		}
		if (br != null) {
			br.close();
		}
		if (serverSocket != null) {
			serverSocket.close();

		}
		if (socket != null) {
			socket.close();
		}

	}

	public static void main(String[] args) {
		
		TestServer ts=new TestServer();
		try {
			ts.go();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		
	}
}
