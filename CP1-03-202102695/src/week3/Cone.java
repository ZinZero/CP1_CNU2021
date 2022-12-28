package week3;

import java.util.Scanner;
public class Cone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        
        System.out.print(Math.round((x * x * Math.PI * y) / 3 * 1000) / 1000.0);
	}

}
