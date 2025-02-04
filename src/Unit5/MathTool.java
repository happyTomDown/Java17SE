package Unit5;

public class MathTool {
	

	public static int sum(int ...number) {
		var sum = 0;
		for(var numbers:number) {
			sum+=numbers;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(MathTool.sum(1,2,3,4,5));
		

	}

	
}
