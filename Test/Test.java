package com.tech.Test;

import java.util.Scanner;

import com.tech.AllOperation.Operation;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		while (true) {
			System.out.println("Enter The Choice");
			System.out.println(
		" 1.Create Account \n 2.Show Account Details \n 3.Deposit Amount \n 4.Balance Enquiry \n 5.Withdrwal Amount \n 6.Create new account \n");     
			         int x = sc.nextInt();
			switch (x) {

			case 1:
				op.createAccount();
				break;
			case 2:
				op.showAccountDetails();
				break;
			case 3:
				op.deposit();
				break;
			case 4:
				op.balanceEnquiry();
				break;
			case 5:
				op.withdrwalBalance();
				break;
				
			case 6:
				op.get();
				break;

			default:
				System.out.println("Enter Valid Input");
				break;
			}
		}
	}
}
