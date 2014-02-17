package tk.bartbart333.udp;

import java.net.DatagramPacket;
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
		byte[] data = new byte[1024 * 16];
		DatagramPacket datapacket = new DatagramPacket(data, data.length);
		
		while(running){
			
		}
		
		return;
	}
}