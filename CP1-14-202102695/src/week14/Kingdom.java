package week14;

import java.util.Scanner;

public class Kingdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sumG = 0, sumA = 0, countV = 0, countA = 0;
		int gold = 0, army = 0, closeness = 0;
		
		String input;
		String[] temp;
		
		Vassal v = null;
		
		while(true) {
			// Fill codes here.
		}
		
		sc.close();
		
		System.out.println("Gold: " + sumG);
		System.out.println("Army: " + sumA);
		System.out.println("Approval: " + Math.round((double) countA / countV * 100) + "%");
	}

}
abstract class Vassal {
	int gold;
	int army;
	int closeness;
	
	public Vassal(int g, int a, int c) {
		this.gold= g;
		this.army = a;
		this.closeness = c;
	}
	
	abstract int getGold();
	abstract int getArmy();
	abstract boolean checkApproval();
}

class Noble extends Vassal {
	// Fill codes here.
}

class Mayor extends Vassal {
	// Fill codes here.
}

class Bishop extends Vassal {
	// Fill codes here.
}
