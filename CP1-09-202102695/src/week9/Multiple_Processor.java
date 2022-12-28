package week9;

import java.util.Scanner;

public class Multiple_Processor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input multiplicand and multiplier.
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		sc.close();
		
		int multiplier = Integer.parseInt(input[1]);
		
		Multiple m = new Multiple();
		
		// Multiply as integer or string to string.
		String result;
		try {
			int multiplicand = Integer.parseInt(input[0]);
			result = m.multiply(multiplicand, multiplier);
		}
		catch(NumberFormatException e) {
			String multiplicand = input[0];
			result = m.multiply(multiplicand, multiplier);
		}
		
		System.out.print(result);
	}
}

class Multiple {
	String result;
	
	String multiply(int multiplier,int multiplicand) {
		return Integer.toString(multiplier * multiplicand);}
	
	String multiply(String multiplier,int multiplicand){
		return multiplier.repeat(multiplicand);}
}
