package Unit6;

class Some1 {
	Some1() {
		System.out.println("呼叫Some1()");
	}

	Some1(int i) {
		System.out.println("呼叫Some1(int i)");
	}
}

class other extends Some1 {
	other() {
		super(1);
		System.out.println("呼叫other()");
	}

	other(int i) {
		this();
		System.out.println("呼叫other(int i)");
	}
}

public class Some {
	final int x;
	Some(int x){
		this.x = x;
	}
	public static void main(String[] args) {
		new other(10);
	}

}
