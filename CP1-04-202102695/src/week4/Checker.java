package week4;

import java.util.Scanner;
public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		char word = sc.next().charAt(0);
		
		String answer = (97 <= word && 122 >= word ) ? "LowerCase" : 
						(65 <=word && 90 >= word) ?  "UpperCase" : 
						(48 <= word && 57 >= word) ? "Digit" : "Error";
		
		System.out.println(answer);
	
	}

}
