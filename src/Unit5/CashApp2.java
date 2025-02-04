package Unit5;

import java.util.Scanner;

public class CashApp2 {

	public static void main(String[] args) {
		CashCard2[] cards = { new CashCard2("A001", 500, 0), new CashCard2("A002", 300, 0),
				new CashCard2("A003", 1000, 1) };
		var console = new Scanner(System.in);
		for (var card : cards) {
			System.out.printf("(%s,%d,%d)儲值:", card.getNumber(), card.getBalance(), card.getBonus());
			card.store(console.nextInt());
			System.out.printf("明細 (%s,%d,%d)%n", card.getNumber(), card.getBalance(), card.getBonus());

		}

	}

}
