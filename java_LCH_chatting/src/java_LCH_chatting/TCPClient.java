package java_LCH_chatting;

import java.net.*;

public class TCPClient {
	public static void main(String[] args) {

		String serverIP = "127.0.0.1";
//		String serverIP = "192.168.0.88";

		try {
			Socket socket = new Socket(serverIP, 7777);

			System.out.println("서버에 연결되었습니다.");

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();

		} catch (Exception e) {
			
		}
	}
}