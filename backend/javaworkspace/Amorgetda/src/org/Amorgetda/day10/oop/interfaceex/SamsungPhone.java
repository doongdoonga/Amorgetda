package org.Amorgetda.day10.oop.interfaceex;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
	}

	@Override
	public void sendCall() {
		System.out.println("===== S-PHONE CALL =====");		
	}

}
