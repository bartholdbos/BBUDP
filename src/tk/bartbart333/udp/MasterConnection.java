package tk.bartbart333.udp;

import java.net.InetAddress;

public class MasterConnection extends Connection {
	
	protected MasterConnection(InetAddress ip, int port){
		super(ip, port);
	}
	
	@Override
	protected void connect(){
		
	}
	
	@Override
	protected void receive(Packet packet){
		
	}
}