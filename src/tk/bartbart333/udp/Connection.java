package tk.bartbart333.udp;

import java.net.InetAddress;
import java.util.ArrayList;

public abstract class Connection extends Thread{
	
	private ArrayList<Packet> packets = new ArrayList<Packet>();
	private InetAddress ip;
	private int port;
	private boolean running = true;
	
	protected abstract void connect();
	
	protected abstract void receive(Packet packet);
	
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
	
	public void addPacket(Packet packet){
		packets.add(packet);
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