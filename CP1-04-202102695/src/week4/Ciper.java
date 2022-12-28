package week4;

import java.util.Scanner;
public class Ciper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		String word = sc.next();
				
		char w0 = word.charAt(0);
		char w1 = word.charAt(1);
		char w2 = word.charAt(2);
		char w3 = word.charAt(3);
		char w4 = word.charAt(4);
		
		System.out.print((int)w0);
		System.out.print((int)w1);
		System.out.print((int)w2);
		System.out.print((int)w3);
		System.out.print((int)w4);
	}

}
