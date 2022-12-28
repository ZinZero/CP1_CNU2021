package week5;

import java.util.Scanner;
public class Standardweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double m = sc.nextDouble();
		double w = sc.nextDouble();
		double BMI = (Math.round( (w / ( (m / 100) * (m / 100) ) ) * 100) /100.0);
		
		sc.close();
		
		if(BMI < 18.5) {
			System.out.print("under");
		}else if(BMI >= 23) {
			System.out.print("over");
		}else {
			System.out.print("standard");
		}
	}

}
