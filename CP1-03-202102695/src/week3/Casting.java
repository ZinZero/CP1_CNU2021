package week3;

import java.util.Scanner;
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       double x;
       x = sc.nextDouble();
       int y = (int) x;
       
       System.out.println(y);
       String a = Integer.toBinaryString(y);
       System.out.print(a);
	}

}
