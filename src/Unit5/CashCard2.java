package Unit5;

public class CashCard2 {
	private String number;
	private int balance;
	private int bonus;

	public String getNumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public int getBonus() {
		return bonus;
	}

	public CashCard2(String number, int balance, int bonus) {
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	public void store(int money) {
		if (money > 0) {
			balance += money;
			if (money >= 1000) {
				bonus++;
			}
		} else {
			System.out.println("請檢查儲值金額");
		}
	}

	public void charge(int money) {
		if (money > 0) {
			if (money <= balance) {
				balance -= money;
			} else {
				System.out.println("餘額不足請儲值");
			}
		} else {
			System.out.println("請檢查儲值金額");

		}
	}

	public int exchange(int bonus) {
		if (bonus > 0) {
			this.bonus -= bonus;
		}

		return this.bonus;
	}

}
