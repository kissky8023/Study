package tcp.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket ss = new ServerSocket(12345);
		Socket socket = ss.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		in.readLine();
		
		
	}

}
