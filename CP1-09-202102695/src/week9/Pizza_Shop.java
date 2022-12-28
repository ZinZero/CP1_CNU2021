package week9;

import java.util.Scanner;

public class Pizza_Shop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input orders.
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		sc.close();
		
		// Make pizza according to each order.
		for(int i = 0; i < input.length; i++) {
			String[] order = input[i].split("-");
			int orderNumber = Integer.parseInt(order[0]);
			
			Pizza p;
			switch(orderNumber) {
			case 1 :
				p = new Pizza(order[1]);
				break;
			case 2 :
				p = new Pizza(Integer.parseInt(order[1]));
				break;
			case 3 :
				p = new Pizza(order[1].charAt(0));
				break;
			default :
				p = new Pizza();
			}
			
			System.out.printf("Pizza %2d : %s,\t%2d pices,\t%c size\n",
					i + 1, p.menu, p.pieces, p.size);
		}
	}
}

class Pizza {
	String menu;
	int pieces;
	char size;
		
	{
		menu = "Pepperoni";
		pieces = 8;
		size = 'M';
	}
	
	Pizza(String menu){
		this.menu = menu;

	}
	Pizza(int pieces){
		this.pieces = pieces;

	}
	Pizza(char size){
		this.size = size ;
		
	}
	Pizza(){	}
}
