package Unit6;

import java.util.Scanner;

public abstract class GuessGame {
	public void go() {
		int number = (int) (Math.random() * 10);
		int guess = -1;
		do {
			print("請輸入數字:");
			guess = nextInt();
		}while(guess != number);
		print("猜中了");
	}

	public void println(String text) {
		print(text + "\n");
	}

	public abstract void print(String text);

	public abstract int nextInt();
}
