package Unit4;

public class Practise2Poker2 {

	public static void main(String[] args) {
		var poker = new int[52];
		boolean isRepeat;
		int temp;
		for (int i = 0; i < poker.length; i++) {
			do {
				temp = (int) (Math.random() * 52);
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						isRepeat = true;
						break;
					}

				}
			} while (isRepeat);
			poker[i]=temp;
			System.out.printf("%d:%d%n", i, poker[i]);

		}

	}

}
