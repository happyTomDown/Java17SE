package Unit4;

public class OneTo100 {
	public static void main(String[] args) {
		var oneTo100 = new StringBuilder();
		for (int i = 1; i < 100; i++) {
			oneTo100 = oneTo100.append(i).append('+');
		}
		System.out.print(oneTo100.append("100").toString());
	}
}
