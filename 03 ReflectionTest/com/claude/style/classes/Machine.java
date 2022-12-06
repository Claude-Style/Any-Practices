package com.claude.style.classes;

public abstract class Machine {
	protected boolean status;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		System.out.println("turning Machine On/Off");
	}
}
