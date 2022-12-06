package com.claude.style.classes;

public class Computer extends Machine {

	private String os;

	
	
	@Override
	public boolean isStatus() {
		// TODO Auto-generated method stub
		return status;
	}
	@Override
	public void setStatus(boolean status) {
		// TODO Auto-generated method stub
		System.out.println("turning Computer On/Off ");
		this.status=status;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public void turnOn()
	{
		setStatus(true);
		System.out.println("computer is starting.....");
	}
	public void turnOff()
	{
		setStatus(false);
	}
	public void installOS(String osName)
	{
		setOs(osName);
	}
}
