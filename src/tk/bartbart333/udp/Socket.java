package tk.bartbart333.udp;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Socket extends Thread{
	
	private DatagramSocket datasocket;
	
	public Socket() throws SocketException{
		datasocket = new DatagramSocket();
		
		this.start();
	}
	
	public void run(){
		
	}
}