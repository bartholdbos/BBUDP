package tk.bartbart333.udp;

import java.net.InetAddress;

public class Connection extends Thread{
	
	public Connection(InetAddress ip, int port){
		this.start();
	}
	
	public void run(){
		
	}
}