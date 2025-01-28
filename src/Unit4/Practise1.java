package Unit4;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("求幾個費式數?");
		int mon = scanner.nextInt();
		int[] fn = new int[mon];
		fn[0] = 0;
		if(mon>1) {
		fn[1] = 1;
		}

		for (int i = 2; i < mon; i++) {
			fn[i] = fn[i - 1] + fn[i - 2];
		}
		for(var fns:fn) {
			System.out.printf("%d ",fns);
		}

	}

}
