package Unit4;

public class Average {

	public static void main(String[] args) {
		var sum = 0;
		for(var arg: args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("平均:" +sum/args.length);
	}

}
