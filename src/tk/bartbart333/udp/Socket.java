package tk.bartbart333.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;

public class Socket extends Thread{
	
	private DatagramSocket datasocket;
	private boolean running = true;
	private ArrayList<Connection> connections = new ArrayList<Connection>();
	
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
		Packet packet;
		
		while(running){
			try{
				datasocket.receive(datapacket);
				
				for(Connection connection : connections){
					if(datapacket.getAddress().equals(connection.getAddress()) && datapacket.getPort() == connection.getPort()){
						packet = new Packet(datapacket.getData(), datapacket.getLength());
						
						connection.addPacket(packet);
					}
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		return;
	}
}