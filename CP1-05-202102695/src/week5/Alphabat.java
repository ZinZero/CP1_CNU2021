package week5;

import java.util.Scanner;
public class Alphabat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char word = sc.next().charAt(0);
		sc.close();
		
		if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
		
	}

}