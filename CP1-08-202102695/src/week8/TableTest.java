package week8;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class TableTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Table table = new Table();
		int[] data = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		IntStream.range(0, data.length).forEach(i -> {
			switch (i) {
			case 0:
				table.width = data[i];
				break;
			case 1:
				table.height = data[i];
				break;
			}
		});
		System.out.println(table.area());
		scanner.close();
	}

}

class Table{
	int width;
	int height;
	
	int area() {return width * height;}
	
}
