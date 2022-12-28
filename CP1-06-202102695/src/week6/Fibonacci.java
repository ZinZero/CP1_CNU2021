package week6;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int a = 1;
		int b = 1;
		int c = 0;
		int d = 2;
		
		while(c < num) {
			d += c;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(d);
	}
}
