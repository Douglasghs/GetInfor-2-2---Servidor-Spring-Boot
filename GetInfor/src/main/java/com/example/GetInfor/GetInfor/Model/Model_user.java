package com.example.GetInfor.GetInfor.Model;

public class Model_user {
	
	private String WindowsUser;
	private String IPAddress;
	private String HostName;
	
	public Model_user(String windowsUser, String iPAddress, String hostName) {
		super();
		WindowsUser = windowsUser;
		IPAddress = iPAddress;
		HostName = hostName;
	}

	public String getWindowsUser() {
		return WindowsUser;
	}

	public void setWindowsUser(String windowsUser) {
		WindowsUser = windowsUser;
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}

	public String getHostName() {
		return HostName;
	}

	public void setHostName(String hostName) {
		HostName = hostName;
	}

}
