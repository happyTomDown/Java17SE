package Unit3;

import java.util.Scanner;

public class Level3 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		var quotient = score / 10;
		var level = switch (quotient) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'E';
		};
		System.out.printf("得分等級:%c%n", level);
	}
}
