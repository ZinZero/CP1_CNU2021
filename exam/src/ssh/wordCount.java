package ssh;

import java.util.Scanner;
public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
				
		String word = sc.nextLine();
		
		String[] arr = word.split(" ");
		
		System.out.println(arr.length);
		
		sc.close();


	}

}
