package Unit4;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {
        int[] number = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
		int temp;
		boolean swapped=true; // 旗標變數，檢查是否發生交換
		for (int i = 0; i < number.length - 1&& swapped; i++) {
			swapped = false;
			for (int j = 0; j < number.length - 1 - i; j++) {
				if (number[j] > number[j + 1]) {
					temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
                    swapped = true; // 有發生交換，設為 true
				}
			}

		}
		System.out.print("排序後的數字:");
		for (int numbers : number) {
			System.out.printf("%-3d", numbers);
		}
	}

}
