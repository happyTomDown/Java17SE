package Unit4;

public class lrregularArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		arr[0] = new int[] { 1, 2, 3, 4, 5 };
		arr[1] = new int[] { 1, 2, 3 };

		for (int[] row : arr) {
			for (int value : row) {
				System.out.printf("%2d", value);
			}
			System.out.println();
		}
		System.out.println();

		int[][] arr2 = { { 6, 7, 8, 9, 10 }, { 6, 7, 8 } };
		for (int x = 0; x < arr2.length; x++) {
			for (int y = 0; y < arr2[x].length; y++) {
				System.out.printf("%d ",arr2[x][y]);
			}
			System.out.println();
		}
	}
}
