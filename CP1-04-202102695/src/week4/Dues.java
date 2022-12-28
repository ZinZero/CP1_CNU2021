package week4;

import java.util.Scanner;
public class Dues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int minValue = c < a ? c : a;
		int minValue1 = b < d ? b : d;
		int minValue2 = minValue < minValue1 ? minValue : minValue1; 
		
		System.out.print(minValue2);
		
		sc.close();
	}

}
