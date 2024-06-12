package kosa.net2;

import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;

		try {
			socket = new Socket("127.0.0.1", 9001);
			System.out.println("클라이언트 실행중....");
			Thread sender = new ClientSender(socket);
			Thread receive = new ClientReceive(socket);

			
			sender.start();
			receive.start();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
