package Unit3;

public class MultiplicationTable {

	public static void main(String[] args) {
		for(int j =1 ; j < 10; j++) {
			for(int i =2;i < 10;i++) {
				System.out.printf("%d X %d =%-3d ",i,j,i*j);
			}
			System.out.println();
		}
	}

}
