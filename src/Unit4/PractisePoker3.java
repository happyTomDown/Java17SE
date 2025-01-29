package Unit4;

public class PractisePoker3 {

	public static void main(String[] args) {
		int num = 52;
		int[] poker = new int[num];
		int count = 0;

		for (int i = 0; i < poker.length; i++) {
			poker[i] = i;
		}
		for (int i = num - 1; i > 0; i--) {
			int temp = (int) (Math.random() * (i + 1));
			int exchange;
			exchange = poker[i];
			poker[i] = poker[temp];
			poker[temp] = exchange;
		}
		String[] suits = { "梅花", "方塊", "紅心", "黑桃" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (int card : poker) {
			System.out.printf("%s%-3s", suits[card / 13], ranks[card % 13]); // 格式化輸出

			count++;
			if (count % 6 == 0) {
				System.out.println();
			}
		}
	}
}