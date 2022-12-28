package week2;

import java.util.Scanner;
public class PrintFormating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        sc.close();
        
        String word = sc.nextLine();
        
        System.out.print(word);
        System.out.println();
        System.out.printf("%2s", word);
        System.out.println();
        System.out.printf("%3s", word);
        System.out.println();
        System.out.printf("%4s", word);
        System.out.println();
        System.out.printf("%5s", word);
	}

}
