package Unit4;

import java.util.Scanner;

public class Practise4 {
	public static void main(String[] args) {
		boolean b ;
		int temp;
		var scanner = new Scanner(System.in);
		int[] number = { 1, 10, 31, 33, 37, 48, 60, 70, 80 };
		do {
			b = true;
			temp = scanner.nextInt();
			for (int i = 0; i < number.length; i++) {
				if (temp == number[i]) {
					System.out.println(i);
					b = false;
					break;
				}

			}
			if (b == true) {
				System.out.println(-1);
			}

		} while (b);

	}
}
