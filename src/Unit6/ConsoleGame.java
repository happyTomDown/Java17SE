package Unit6;

import java.util.Scanner;

public class ConsoleGame extends GuessGame {
	Scanner console = new Scanner(System.in);

	@Override
	public void print(String text) {
		System.out.print(text);
	}

	@Override
	public int nextInt() {
		return console.nextInt();
	}

}
