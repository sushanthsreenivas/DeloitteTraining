package com.deloitte.main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int num1 , num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();

		Arithmetic[] select= new Arithmetic[5];
		select[1] = new Addition(num1, num2);
		select[2] = new Subtraction(num1, num2);
		select[3] = new Multiplication(num1, num2);
		select[4] = new Division(num1, num2);
		
	
	
		System.out.println("#1 for additon #2 for subtraction #3 for multiplication #4  division");
		int i  = sc.nextInt();
		
		int ans = select[i].calculate();
		System.out.println("Evaluated answer "+ ans);
		sc.close();
		
	}
		

}
