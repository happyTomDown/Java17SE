package Unit4;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number = (int) (Math.random() * 10);
		int guess = -1;
		do {
			System.out.print("猜數字(0 ~ 9):");
			guess = console.nextInt();
			if (guess < 0 || guess > 9) {
				System.out.println("請輸入 0 ~ 9 之間的數字！");
				continue;
			}
		} while (guess != number);
		System.out.println("猜中了 ...XD");
	}

}
