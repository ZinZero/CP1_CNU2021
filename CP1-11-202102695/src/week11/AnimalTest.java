package week11;

import java.util.Scanner;
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number0fFoot = sc.nextInt();
		int howTall = sc.nextInt();
		String name = sc.next();
		sc.close();
		
		Animal anyAnimal = null;
		
		abstract class Animal{
			String name;
			
			String name(){	return getClass().toString();}
			setName(String newName);
			abstract String talk();
			
			
			
		}
		
		System.out.println(anyAnimal.name());
		System.out.println(anyAnimal.talk());
		System.out.println(anyAnimal.move());
			
		
	}

}
