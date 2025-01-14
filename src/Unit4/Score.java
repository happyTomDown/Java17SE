package Unit4;

public class Score {

	public static void main(String[] args) {
		int[] scores = {88, 81, 74, 99, 90, 11, 43, 52, 12,22};
		for(int i= 0; i<scores.length;i++) {
			System.out.println("學生分數:"+scores[i]);
			
		}
		System.out.println("---------------------");
		//Enhanced for loop
		for(int score : scores) {
			System.out.printf("學生分是:%d%n",score);
		}
	}

}
