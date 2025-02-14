package Unit6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int count = 0;
		Test2 test2 = new Test2();


		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入要幾組:");
		int group = scanner.nextInt();
		System.out.print("請輸入要玩幾星:");
		int star1 = scanner.nextInt();
		int[][] star = new int[group][star1];
		test2.poker(star);
		test2.poker2(star);

		for (int[] star2 : star) {
			for (int stars : star2) {
				System.out.printf("%-4d", stars);
				count++;
				if (count % star1 == 0) {
					System.out.println();
				}
			}
		}
	}

}
