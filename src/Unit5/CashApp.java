package Unit5;

public class CashApp {

	public static void main(String[] args) {
		CashCard[] cards  = {
		new CashCard("A001",500,0),
		new CashCard("A002",300,0),
		new CashCard("A003",1000,1),
		new CashCard("A004",2000,2),
		new CashCard("A005",3000,3)
		};
		for(var card:cards) {
			System.out.printf("(%s, %-5d, %d)%n",card.number,card.balance,card.bonus);

		}

	}

}
