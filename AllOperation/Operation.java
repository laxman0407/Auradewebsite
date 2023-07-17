package com.tech.AllOperation;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.tech.FeildClass.Customer;

public class Operation {
	Scanner sc = new Scanner(System.in);
	Set<Customer> s=new TreeSet<>();
	int c=100;
	Customer cs;

	public void createAccount() {
		cs=new Customer();
		while (true) {
			
			System.out.println("Enter account type");
			System.out.println(" 1.Saving Account \n 2.Current Account \n ");
			try {
				cs.setAccountType(sc.next());
				
				break;
			} catch (Exception e) {
				System.out.println("Enter correct Account Type");
			}
		}
		while (true) {
			System.out.println("Enter Your Name");
			try {
				cs.setName(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("Enter Correct Name");
			}
		}
		while (true) {
			System.out.println("Enter Your Address");
			try {
				cs.setAddress(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("Enter Correct address");
			}
		}
		while (true) {
			System.out.println("Enter Your Mobile Number ");
			try {
				cs.setMobileNumber(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("Enter Your Correct Mobile Number ");
			}
		}
		while (true) {
			System.out.println("Enter Your Username");
			try {
				cs.setUsername(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("Enter Your Correct UserName");
			}
		}
		while (true) {
			System.out.println("Enter Your Password");
			try {
				cs.setPassword(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("Enter your Correct password");
			}
		}
		while (true) {
			System.out.println("Enter your Account Number");
			try {
				cs.setAccountNumber(sc.nextInt());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Enter Correct Account Number");
			}
		}
		while (true) {
			System.out.println("Enter DepositAmount");
			try {
				cs.setDepositAmount(sc.nextDouble());
				if (cs.getDepositAmount() > 0) {
					cs.setTotal(cs.getDepositAmount()+ cs.getTotal());
					System.out.println("total =" + cs.getTotal());
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Enter Valid Amount");
			}
		}
		if(cs!=null) {
			s.add(cs);
		}
		else {
			System.out.println("your Account is null");
		}
		
	
		System.out.println("Done");
		System.out.println("**************");
	}

	public void showAccountDetails() {
//		while (true) {
			System.out.println("Enter Acccount Number");

			int x = sc.nextInt();
			if (cs.getAccountNumber() == x) {
				System.out.println("Account Number =" + cs.getAccountNumber());
				System.out.println("Name =" + cs.getName());
				System.out.println("Mobile Number =" + cs.getMobileNumber());
				System.out.println("Address =" + cs.getAddress());
				System.out.println("Username =" + cs.getUsername());
				System.out.println("Password =" + cs.getPassword());
				System.out.println("Amount =" + cs.getDepositAmount());
				System.out.println("Total Bal =" + cs.getTotal());
			} else {
				System.out.println("Enter Correct Account Number");
			}
		}
//	}

	public void deposit() {
//		while (true) {
			System.out.println("Enter the Account Number");

			int y = sc.nextInt();
			if (cs.getAccountNumber() == y) {
				System.out.println("Enter Amount");
				cs.setAmount(sc.nextDouble());
				if (cs.getAmount() > 0) 
				{
					cs.setTotal(cs.getAmount()+cs.getTotal());
					System.out.println("Total =" + cs.getTotal());
				} else {
					System.out.println("enter Amount grater than zero");
				}
			} else {
				System.out.println("Enter Correct Account Number");
			}
		}
//	}

	public void balanceEnquiry() {
//		while (true) {
			System.out.println("Enter Account Number");

			int z = sc.nextInt();
			if (cs.getAccountNumber() == z) {
				cs.setTotal(cs.getTotal());
				System.out.println("Available Bal =" + cs.getTotal());

			} else {
				System.out.println("Enter Correct Account Number");
			}
		}
//	}

	public void withdrwalBalance() {
//		while (true) {
			System.out.println("Enter Account Number");

			int l = sc.nextInt();
			if (cs.getAccountNumber() == l) {
				System.out.println("Enter Amount");
				cs.setAmount(sc.nextDouble());
				if (cs.getAmount() > 0) {
					cs.setTotal(cs.getTotal() - cs.getAmount());
					System.out.println("Avail Bal =" + cs.getTotal());
				} else {
					System.out.println("enter Amount grater than zero");
				}
			} else {
				System.out.println("Enter Correct Account Number");
			}
		}
	public void get() {
		for(Customer z:s) {
			System.out.println("Name="+z.getName());
			System.out.println("userName="+z.getUsername());
			System.out.println("password="+z.getPassword());
			System.out.println("mobile no="+z.getMobileNumber());
			System.out.println("AccountType="+z.getAccountType());
			System.out.println("Address="+z.getAddress());
			System.out.println("Deposit Amount="+z.getDepositAmount());
			System.out.println("Total Amount="+z.getTotal());
			System.out.println();
		}
	}
	public void transferMoney() {
		
	}
	}

