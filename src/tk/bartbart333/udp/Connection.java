package tk.bartbart333.udp;

import java.net.InetAddress;

public class Connection extends Thread{
	
	private InetAddress ip;
	private int port;
	
	public Connection(InetAddress ip, int port){
		this.ip = ip;
		this.port = port;
		this.start();
	}
	
	public InetAddress getAddress(){
		return ip;
	}
	
	public int getPort(){
		return port;
	}
	
	public void run(){
		
	}
}