package java_LCH_chatting;

import java.io.DataInputStream;
import java.net.*;

public class Receiver extends Thread {
	Socket socket;
	DataInputStream in;

	public Receiver(Socket socket) {
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			
		}
	}

	@Override
	public void run() {

		while (in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (Exception e) {
				
			}
		}
	}
}