package tk.bartbart333.udp;

import java.util.HashMap;
import java.util.Map.Entry;

public class Packet {
	
	private HashMap<String, String> headers = new HashMap<String, String>();
	private String body = "";
	
	public Packet(byte[] data, int length){
		String s = new String(data, 0, length);
		int headerend = s.indexOf("\n\n");
		
		String headers = s.substring(0, headerend);
		body = s.substring(headerend + 2, length);
		
		for(String line : headers.split("\n")){
			String[] entry = line.split("=");
			
			this.headers.put(entry[0], entry[1]);
		}
	}
	
	public Packet(String body){
		this.body = body;
	}
	
	public Packet(String body, HashMap<String, String> headers){
		this.body = body;
		this.headers = headers;
	}
	
	public String getHeader(String header){
		return headers.get(header);
	}
	
	public void setHeader(String header, String value){
		headers.put(header, value);
	}
	
	public String getType(){
		return getHeader("type");
	}
	
	public void setType(String type){
		setHeader("type", type);
	}
	
	public String getBody(){
		return body;
	}
	
	public void setBody(String body){
		this.body = body;
	}
	
	public byte[] getData(){
		String data = "";
		
		for(Entry<String, String> s : headers.entrySet()){
			data += s.getKey() + "=" + s.getValue() + "\n";
		}
		
		data += "\n" + body;
		
		return data.getBytes();
	}
}