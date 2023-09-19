package models;

import java.util.ArrayList;

public class Person {

	public int phoneNumber;
	public String email;
	public String address;
	public String deliveryTime;
	public int deliveryCharge;

	

	public Person(int phoneNumber, String email, String address, String deliveryTime, int deliveryCharge) {
		
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.deliveryTime = deliveryTime;
		this.deliveryCharge = deliveryCharge;
		

	}



	@Override
	public String toString() {
		return "Person [phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address + ", deliveryTime="
				+ deliveryTime + ", deliveryCharge=" + deliveryCharge + "]";
	}


}
