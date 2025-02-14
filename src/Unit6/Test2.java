package Unit6;

public class Test2 {
	boolean isRepeat;
	int temp;
	int temp2;
	public void poker(int[][]star) {

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				do {
					temp = (int) (Math.random() * 80 + 1);
					isRepeat = false;
					for (int k = 0; k < j; k++) {
						if (temp == star[i][k]) {
							isRepeat = true;
							break;
						}
					}
				} while (isRepeat);
				star[i][j] = temp;

			}
		}
	}
	public void poker2(int[][]star) {
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length - 1; j++) {
				for (int k = 0; k < star[i].length - 1 - j; k++) {
					if (star[i][k] > star[i][k + 1]) {
						temp = star[i][k];
						star[i][k] = star[i][k + 1];
						star[i][k + 1] = temp;
					}
				}
			}
		}
	}
}
