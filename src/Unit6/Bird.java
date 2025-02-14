package Unit6;

public class Bird {
	protected String name;
	Bird(String name){
		this.name = name;
	}
	public Bird copy() {
		return new Bird(name);
	}
}
