package week3;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int x,y;
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        System.out.println((x + y));
        System.out.println((x - y));
        System.out.println((x * y));
        System.out.print((x / y) + " " + (x % y));
	}

}
