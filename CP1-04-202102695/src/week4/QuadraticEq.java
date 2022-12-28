package week4;

import java.util.Scanner;
public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		double a,b,c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double x1 = (-b + Math.sqrt( (b*b) - (4*a*c) ) ) / (2 * a);
		double x2 = (-b - Math.sqrt( (b*b) - (4*a*c) ) ) / (2 * a);
		
		double D = Math.sqrt((b * b) - (4*a*c));
		
		if( D >= 0 ) {
			System.out.println("True");
			System.out.println((Math.round(x1 * 100.0) / 100.0));
			System.out.println((Math.round(x2 * 100.0) / 100.0)); 
		}else {
			System.out.println("False");
		}
		
		
	}

}
