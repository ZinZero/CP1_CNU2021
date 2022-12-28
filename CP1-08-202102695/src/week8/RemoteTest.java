package week8;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class RemoteTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Remote remote = new Remote();
		int[] data = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		IntStream.range(0, data.length).forEach(i -> IntStream.range(0, data[i]).forEach(j -> {
			switch (i) {
			case 0:
				remote.power();
				break;
			case 1:
				remote.channelUp();
				break;
			case 2:
				remote.channelDown();
				break;
			case 3:
				remote.volumeUp();
				break;
			case 4:
				remote.volumeDown();
				break;
			}
		}));
		System.out.println(remote.power + " " + remote.channel + " " + remote.volume);
		scanner.close();
	}
	
}

class Remote{
	boolean power;
	int channel;
	int volume;
	
	void power() 	{ power = !power; }
	void channelUp()	{ ++channel; }
	void channelDown()	{ --channel; }
	void volumeUp() 	{ ++volume;}
	void volumeDown()	{ --volume;}
	
}
