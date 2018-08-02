package com.deloitte.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int array[] = new int[n];
		if (n > 2) {
			System.out.print("Enter the elements of the array");
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}
			boolean status = Triplets.searchTrip(array);
			if (status)
				System.out.println("TRUE");
			else
				System.out.println("FALSE");
		} else if (n < 3) {
			System.out.println("Note: enter a size greater than or equal to 3");
		}
		sc.close();
	}

}

