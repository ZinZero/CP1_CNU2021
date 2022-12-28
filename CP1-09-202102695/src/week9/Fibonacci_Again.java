package week9;

import java.util.Scanner;

public class Fibonacci_Again {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input the length of sequence.
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.close();
		
		// Output terms in sequence.
		Fibonacci f;
		for(int i= 0; i < length; i++) {
			f = new Fibonacci();
			System.out.print(f.term + " ");
		}
	}
}

class Fibonacci {
	static int ta = 0;
	static int tb = 1;
	int term = 0;
	
	{	
			term = ta + tb;
			ta = tb;
			tb =  term;
		
	}
}
