package Unit3;

import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		var quotient = score / 10;
		var level = switch (quotient) {
		case 10, 9:
			yield 'A';
		case 8:
			yield 'B';
		case 7:
			yield 'C';
		case 6:
			yield 'D';
		default:
			yield 'E';
		};

	}

}
