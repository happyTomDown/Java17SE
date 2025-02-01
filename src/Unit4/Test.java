package Unit4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] number = { 1, 10, 31, 33, 37, 48, 60, 70, 80 };
		int User = new Scanner(System.in).nextInt();
		int temp = -1;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == User) {
				temp = i;
				break;
			}
		}
		System.out.println(temp);
	}

}
