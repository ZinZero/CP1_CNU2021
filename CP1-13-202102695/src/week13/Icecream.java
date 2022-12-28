package week13;

import java.util.Scanner;
public class Icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int icecream = sc.nextInt();
		int people = sc.nextInt();
		sc.close();
		
		if(icecream == 0) {
			System.out.print("Empty.");
			return;
		}
		
		if(icecream < people) {
			System.out.print("There are people more than ice cream.");
			return;
		}
		
		if(icecream == 0 && people == 0) {
			System.out.print("Empty.");
			return;
		}
		
		try {
		int result = icecream /  people;
		int remain = icecream % people;
		
		System.out.printf("%d %d", result, remain);
		} catch(ArithmeticException e) {
			System.out.print("No one wants.");
		}
	}

}
