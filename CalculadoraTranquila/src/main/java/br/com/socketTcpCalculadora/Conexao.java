package br.com.socketTcpCalculadora;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Conexao {

	public static void send (Socket socket, Object object) {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(object);
			
		}catch (Exception e) {
			System.out.println("O problema no ObjectOutputStream: " + e);
		}
	}
	
	public static Object receive (Socket socket) {
		ObjectInputStream in;
		Object object = null;
		try {
			in = new ObjectInputStream(socket.getInputStream());
			object = in.readObject();
		}catch (Exception e) {
			System.out.println("O Problema no InputStram: " + e);
		}
		return object;
	}
	
}
