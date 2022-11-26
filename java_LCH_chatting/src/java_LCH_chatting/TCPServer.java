package java_LCH_chatting;

import java.net.*;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			socket = serverSocket.accept();

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();

		} catch (Exception e) {
			
		}
	}
}