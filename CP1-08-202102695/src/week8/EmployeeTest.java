package week8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		ArrayList<Employee> arrays = new ArrayList<>();
		IntStream.range(0, count).forEach(i -> {
			String[] data = scanner.nextLine().split(" ");
			Employee e = new Employee();
			e.name = data[0];
			e.salary = Integer.parseInt(data[1]);
			arrays.add(e);
		});
		arrays.sort((first, second) -> {
			if (first.compare(second).equals(first.name)) {
				return 1;
			}
			return -1;
		});
		arrays.forEach(i -> System.out.print(i.name));
		scanner.close();
	}	

}

class Employee{
	String name;
	int salary;
	
	String compare(Employee other) {
		if( salary < other.salary) {
			return other.name;
		}else {
			return name;
		}
	}
}
