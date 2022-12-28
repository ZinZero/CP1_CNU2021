package week6;

import java.util.Scanner;
public class Star_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			for(int j=0; j<num - 1 - i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i +1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
