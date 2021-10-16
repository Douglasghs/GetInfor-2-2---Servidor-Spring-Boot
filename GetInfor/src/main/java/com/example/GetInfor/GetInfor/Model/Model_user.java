package com.example.GetInfor.GetInfor.Model;

import java.util.ArrayList;

public class Model_user {
	
	private String IPV4;
	private String IPV6;
	private String UserName;
	private String HostName;
	private String MemoryRAM;
	
	
	public Model_user(String iPV4, String iPV6, String userName, String hostName, String memoryRAM) {
		
		super();
		IPV4 = iPV4;
		IPV6 = iPV6;
		UserName = userName;
		HostName = hostName;
		MemoryRAM = memoryRAM;
	}


	public String getIPV4() {
		return IPV4;
	}


	public void setIPV4(String iPV4) {
		IPV4 = iPV4;
	}


	public String getIPV6() {
		return IPV6;
	}


	public void setIPV6(String iPV6) {
		IPV6 = iPV6;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getHostName() {
		return HostName;
	}


	public void setHostName(String hostName) {
		HostName = hostName;
	}


	public String getMemoryRAM() {
		return MemoryRAM;
	}


	public void setMemoryRAM(String memoryRAM) {
		MemoryRAM = memoryRAM;
	}
		
	
}