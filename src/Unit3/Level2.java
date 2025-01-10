package Unit3;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		var quotient = score / 10 ;
		var level = '\0';
		switch(quotient) {
		case 10:
		case 9:
			level ='A';
			break;
		case 8:
			level = 'B';
			break;
		case 7:
			level = 'C';
			break;
		case 6:
			level = 'D';
			break;
		default:
			level = 'E';
		}
		System.out.printf("得分等級:%c%n",level);
	}

}
