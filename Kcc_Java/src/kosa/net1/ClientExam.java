package kosa.net1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1",9000); //서버 소켓연결
			InputStream in = socket.getInputStream();
			OutputStream out =socket.getOutputStream();
			
			String message = "Hi Server";
			out.write(message.getBytes());
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println("서버가 보낸메세지: "+ new String(arr));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
