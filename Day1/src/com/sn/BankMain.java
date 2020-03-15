package com.sn;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI obj= new PrivateBank();
		obj.atm();
		obj.deposit();
		obj.withdrawl();
		
		RBI obj2= new PublicBank();
//		obj2.atm();
		obj2.deposit();
		obj2.withdrawl();

	}

}
