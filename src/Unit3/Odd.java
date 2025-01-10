package Unit3;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		var user = new Scanner(System.in);
		var input = user.nextInt();
		var remain = input % 2;
		if (remain == 1) {
			System.out.printf("%d 是奇數%n",input);
		} else {
			System.out.printf("%d 是偶數%n",input);
		}
	}

}
