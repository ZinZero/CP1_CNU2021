package week7;

import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] bucket = new int[50];
		
		for(int i=0; i < 50; i++) {
			bucket[i] = i +1;
		}
		
		String x = sc.nextLine();
		String[] number = x.split(" ");
		int[] division = new int[number.length];
		
		for(int j=0; j < division.length; j++) {
			division[j] = Integer.parseInt(number[j]);
		}
		
		for(int k=0; k < division.length; k++) {
			for(int j=0; j < 50; j++) {
				if(bucket[j] % division[k] == 0) {
					bucket[j] = 0;
				}
			}
		}
		
		for(int l=0; l < 50; l++) {
			if(bucket[l] != 0) {
				System.out.print(bucket[l] + " ");
			}
		}
	}
	
}
