package Unit5;

class Some {

	void someMethod(int i) {
		System.out.println("int版本");
	}
	void someMethod(Integer i) {
		System.out.println("Integer版本");

	}
}

public class OverloadBoxing {

	public static void main(String[] args) {
		var s = new Some();
		s.someMethod(1);
	}

}
