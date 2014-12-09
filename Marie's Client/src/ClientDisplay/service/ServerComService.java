package ClientDisplay.service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerComService {
	Socket clientSocket;
	
	
	public String communicate(String json) {
		if(json==null || json.isEmpty()) {
			return null;
		}
		String serverReply = null;
		BufferedReader inFromServer;
		
		try {
			clientSocket = new Socket("localhost", 8888);
			DataOutputStream outToServer = new DataOutputStream(
					clientSocket.getOutputStream());
			byte[] input = json.getBytes();
			byte key = (byte) 3.1470;
			byte[] encrypted = input;
			for (int i = 0; i < encrypted.length; i++)
				encrypted[i] = (byte) (encrypted[i] ^ key);
			int length = encrypted.length;
			outToServer.writeInt(length);
			outToServer.write(encrypted);
			outToServer.flush();	
			inFromServer = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			serverReply = inFromServer.readLine();
							
		} catch (Exception e) {
			System.out.println("Cannot Connect to server!");
		} finally {
			try {
				clientSocket.close();
			} catch (IOException e) {
				System.out.println("Unable to close socket: " + e.getMessage());

			}
		}


		return serverReply;
	}
}
