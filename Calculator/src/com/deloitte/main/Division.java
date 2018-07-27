package com.deloitte.main;

public class Division extends Arithmetic {

	private int num3;
	public Division(int num1, int num2) {
		  super(num1, num2);

		 }
	@Override
	public int calculate() {
		double var1;
		
		
		if(num1!=0 && num2 !=0) {
			var1=(float)num1/num2;
			num3=num1/num2;
		
			System.out.println("The answer is" + var1);
		}
		else {
			//try {
			throw new ArithmeticException();
		}
		return num3;
		}

}
