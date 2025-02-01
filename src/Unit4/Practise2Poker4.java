package Unit4;

public class Practise2Poker4 {

	public static void main(String[] args) {
		int num = 52;
		var poker = new int[num];
		int count = 0;
		int temp;
		for (int i = 0; i < poker.length; i++) {
			poker[i] = i;
		}
		for (int i = num - 1; i > 0; i--) {
			var n = (int) (Math.random() * (i + 1));
			temp = poker[i];
			poker[i] = poker[n];
			poker[n] = temp;
		}

		String[] suits = { "梅花", "方塊", "紅心", "黑桃" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		for (int pokers : poker) {
			count++;
			System.out.printf("%s%-2s ",suits[pokers / 13],ranks[pokers % 13]);
			if (count % 13 == 0) {
				System.out.println(); // 每 13 個數字換行
			}
		}

	}
}
