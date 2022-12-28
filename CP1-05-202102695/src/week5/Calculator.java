package week5;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		char op = sc.next().charAt(0);
		int y = sc.nextInt();
		
		sc.close();
		
		
		if(y == 0) {
			System.out.println("error");
		}else if(op == '+') {
			System.out.println(x + y);
		}else if(op == '-') {
			System.out.println(x - y);
		}else if(op == '*') {
			System.out.println(x * y);
		}else if(op == '/') {
			System.out.println((Math.round((double)x / (double)y * 100) / 100.0));
		}
	}

}
