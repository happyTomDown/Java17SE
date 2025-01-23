package Unit4;

public class DeepCopy {

	public static void main(String[] args) {
		Clothes3[] c1 = { new Clothes3("red", 'L'), new Clothes3("blue", 'L') };
		var c2 = new Clothes3[c1.length];
		for (int i = 0; i < c1.length; i++) {
			c2[i] = new Clothes3(c1[i].color, c1[i].size);
		}
		c1[0].color = "yellow";
		System.out.println(c2[0].color);

	}

}
