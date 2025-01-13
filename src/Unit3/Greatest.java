package Unit3;

public class Greatest {

	public static void main(String[] args) {
		int a = 1000;
		int b = 495;
		int c = -1;
		while(b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		System.out.printf("最大公因數是:%d",a);
	}
}
