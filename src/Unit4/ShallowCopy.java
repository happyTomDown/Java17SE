package Unit4;

class Clothes3 {
	String color;
	char size;

	Clothes3(String color, char size) {
		this.color = color;
		this.size = size;
	}

}

public class ShallowCopy {

	public static void main(String[] args) {
		Clothes3[] c1 = {new Clothes3("red", 'L'),new Clothes3("blue", 'M')};
		var c2 = new Clothes3[c1.length];
		for(int i=0; i<c1.length; i++) {
			c2[i] = c1[i];
		}
		c1[0].color = "yellow";
		System.out.println(c2[0].color);
	}

}
