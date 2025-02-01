package Unit4;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("求幾個費式數?");
		int n = scanner.nextInt();
		if(n<=0) {
			System.out.println("請輸入大於0的數");
			return;
		}
		var fibonacci = new int[n];
		if(n>1) {
			fibonacci[1] = 1;			
		}
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		for(int fib:fibonacci) {
			System.out.printf("%-3d",fib);
		}
	}

}
