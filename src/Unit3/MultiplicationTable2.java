package Unit3;

public class MultiplicationTable2 {

	public static void main(String[] args) {
		for (int i = 2, j = 1; j < 10; i = (i == 9) ? (++j / j) + 1 : (i + 1)) {
			System.out.printf("%dX%d=%-3d%c", i, j, i * j, (i == 9 ? '\n' : ' '));
		}
	}

}
