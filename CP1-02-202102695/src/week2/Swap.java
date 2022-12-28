package week2;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int tmp = x;
        x = z;
        z = tmp;
        
        int ttp = y;
        y = x;
        x= ttp;
        
        System.out.println(x);
        System.out.println(y);
        System.out.print(z);
        
	}

}
