package kosa.net2;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9001);
			System.out.println("서버 실행 중.... ");
			socket = serverSocket.accept();
			
			Thread receive = new ServerReceive(socket);
			Thread send = new ServerSender(socket);
			
			receive.start();
			send.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
