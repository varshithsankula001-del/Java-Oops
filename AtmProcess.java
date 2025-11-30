package com.atm;

import java.util.Scanner;

public class AtmProcess implements AtmServices{
	
	private UserDetails userDetails;
	
	public AtmProcess() {
	}
	
	public AtmProcess(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	static Scanner sc = new Scanner(System.in);

	@Override
	public void withdraw() {
		System.out.println("Please Enter Your Account Number : ");
		String account = sc.nextLine();
		
		if(userDetails.getAccountNumber().equals(account)) {
			System.out.println("Please Enter Your Pin Number : ");
			int pin = sc.nextInt();
			
			if(userDetails.getPin() == pin) {
				System.out.println("Please Enter Amount to withdraw : ");
				double amount = sc.nextDouble();
				
				if(amount > 0 && amount <= userDetails.getBalance()) {
					
					userDetails.setBalance(userDetails.getBalance()-amount);
					
					System.out.println("Successfully withdrawed... : ");
					
					System.out.println("Your Current Balance is  : "+userDetails.getBalance());
					
				}else {
					System.out.println("Insufficient balance... : ");
				}
				
			}else {
				System.out.println("Invalid Pin : ");
			}
			
		}else {
			System.out.println("Please Check Your Account Number : ");
		}
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the Account number ");
		String account = sc.nextLine();
		
		if (userDetails.getAccountNumber().equals(account)) {
			System.out.println("Enter the Pin Number . ");
			int Pin = sc.nextInt();
			
			if(userDetails.getPin()== Pin) {
				System.out.println("Enter the Deposite  money ");
				double amount =sc.nextDouble();
				
				if(amount>0) {
					userDetails.setBalance(userDetails.getBalance()+amount);
                    System.out.println("Successfully Deposited... : ");
					System.out.println("Your Current Balance is  : "+userDetails.getBalance());
				}else {
					System.out.println("Enter Valid Money... : ");
				}
			}else {
				System.out.println("Invalid Pin : ");
			}
				
		}
		
		else {
			System.out.println("please Check your account Number: ");
			
		}
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Enter the Account number ");
		String account = sc.nextLine();
		
		if (userDetails.getAccountNumber().equals(account)) {
			System.out.println("Enter the Pin Number . ");
			int Pin = sc.nextInt();
			
			if(userDetails.getPin()== Pin) {
				
			  System.out.println("Your Current Balance is  : "+userDetails.getBalance());
			}
			else {
				System.out.println("Invalid Pin : ");
			}		
		}
		else {
			System.out.println("please Check your account Number: ");
			
		}
		
		
	}

}
