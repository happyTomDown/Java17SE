package Unit4;

public class IntegerArray {

	public static void main(String[] args) {
		Integer[] scores = new Integer[3];
		for (Integer score : scores) {
			System.out.println(score);
		}

		scores[0] = 99;
		scores[1] = 87;
		scores[2] = 66;

		for (Integer score : scores) {
			System.out.println(score);
		}
		// 已經知道
		Integer[] scores2 = { 99, 87, 66 };
		for (int score2 : scores2) {
			System.out.printf("%d ", score2);
		}
		System.out.println();
		// 陣列複製
		int[] scores3 = { 88, 81, 74, 68, 78, 76, 77, 85, 95, 93 };
		int[] scores4 = new int[scores3.length];
		for (int i = 0; i < scores4.length; i++) {
			scores4[i] = scores3[i];
		}
		scores4[0] = 1000;
		System.out.printf("scores4[0]:%d  scores3[0]:%d", scores4[0], scores3[0]);
		System.out.println();

		// 複製陣列System.arraycopy()
		int[] scores5 = { 88, 81, 74, 68, 78, 76, 77, 85, 95, 93 };
		int[] scores6 = new int[scores5.length];
		System.arraycopy(scores5, 0, scores6, 0, scores5.length);
		for (int score6 : scores6) {
			System.out.printf("%d ",score6);
		}
	}

}
