package kosa.net2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;


public class ServerReceive extends Thread{
	
	private Socket socket;

	
	public ServerReceive() {
		super();
	}

	

	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println("서버 수신: "+str);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



	public Socket getSocket() {
		return socket;
	}


	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	
	
}
