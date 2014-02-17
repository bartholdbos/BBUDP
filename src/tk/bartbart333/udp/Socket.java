package tk.bartbart333.udp;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Socket extends Thread{
	
	private DatagramSocket datasocket;
	private boolean running = true;
	
	public Socket() throws SocketException{
		datasocket = new DatagramSocket();
		
		this.start();
	}
	
	public InetAddress getLocalAddress(){
		return datasocket.getLocalAddress();
	}
	
	public int getLocalPort(){
		return datasocket.getLocalPort();
	}
	
	public void close(){
		running = false;
	}
	
	public void run(){
		while(running){
			
		}
		
		return;
	}
}