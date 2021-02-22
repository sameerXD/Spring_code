package com.ncu;

public class Address {
	private String hno;
	private String sec;
	private String landmark;
	private String state;
	private int pin;
	
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", sec=" + sec + ", landmark=" + landmark + ", state=" + state + ", pin=" + pin
				+ "]";
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
  
}
