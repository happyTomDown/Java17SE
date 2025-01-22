package Unit4;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] scores1 = { 88, 81, 74, 68, 78 };
		int[] scores2 = Arrays.copyOf(scores1, scores1.length);

		for (var score : scores2) {
			System.out.printf("%d ", score);
		}
		System.out.println();

		scores2[0] = 99;
		// 不影響score1 參考的陣列物件
		for (int score1 : scores1) {
			System.out.printf("%d ", score1);
		}
		System.out.println();
		// 陣列建立,長度固定 將陣列複製到新陣列
		int[] scores3 = { 1, 2, 3, 4, 5 };
		int[] scores4 = Arrays.copyOf(scores3, scores3.length * 2);
		for (int score4 : scores4) {
			System.out.printf("%d ", score4);
		}
	}

}
