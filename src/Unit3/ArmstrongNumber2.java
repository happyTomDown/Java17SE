package Unit3;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			if (Math.pow(i / 1000, 4) + Math.pow((i % 1000) / 100, 4)
					+ Math.pow((i % 100) / 10, 4) + Math.pow(i % 10, 4) == i) {
				System.out.println(i);
			}
		}
	}

}
