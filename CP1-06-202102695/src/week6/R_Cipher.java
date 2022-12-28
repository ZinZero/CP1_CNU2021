package week6;

import java.util.Scanner;
public class R_Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i=4 ; i >= 0; i-=1) {
			char word = str.charAt(i);
			System.out.print((int)word);
		}
	}

}
