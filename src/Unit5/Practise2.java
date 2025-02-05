package Unit5;

public class Practise2 {

	public static void main(String[] args) {
		var maze = new Maze(
			    new int[][]{{2, 2, 2, 2, 2, 2, 2}, 
			                {0, 0, 0, 0, 0, 0, 0}, 
			                {0, 0, 0, 0, 2, 2, 2}, 
			                {0, 0, 0, 0, 0, 2, 2}, 
			                {0, 0, 0, 0, 0, 2, 2}, 
			                {0, 0, 0, 0, 0, 0, 0}, 
			                {2, 2, 2, 0, 0, 2, 0}},  // (6,6) 改為 0，使其變成新的出口
			    			new Point(6,4)); 

		Mouse.go(maze, new Point(1, 0)); // Start at (1, 0)
		if (!maze.isArrived()) {
			System.out.println("沒找到出口");
		}
		maze.print();
	}
}

class Point {
	final int x;
	final int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Maze {
	private int[][] maze;
	private Point end;

	Maze(int[][] maze, Point end) {
		this.maze = maze;
		this.end = end;
	}

	boolean isArrived() {
		// 檢查老鼠是否到達出口
		return maze[end.x][end.y] == 1;
	}

	boolean isEmpty(Point p) {
	    if (p.x < 0 || p.x >= maze.length || p.y < 0 || p.y >= maze[0].length) {
	        return false;  // 超出邊界時，視為非空地，避免例外
	    }
		return maze[p.x][p.y] == 0;
	}

	void step(Point p) {
		maze[p.x][p.y] = 1; // 標記已走過的地方
	}

	void empty(Point p) {
		maze[p.x][p.y] = 0;
	}

	void print() {
		// 印出迷宮的當前狀態，牆壁為⬛，路為⬜，已走過的地方為◊
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				if (maze[i][j] == 2) {
					System.out.print("⬛ "); // 牆壁
				} else if (maze[i][j] == 1) {
					System.out.print("◊ "); // 已走過的地方
				} else {
					System.out.print("⬜ "); // 路徑
				}
			}
			System.out.println();
		}
	}
}

class Mouse {
	static void go(Maze maze, Point p) {
		maze.step(p); // 記錄當前走過的點
		// 遞迴測試四個方向
		test(maze, new Point(p.x, p.y + 1)); // 向右
		test(maze, new Point(p.x + 1, p.y)); // 向下
		test(maze, new Point(p.x, p.y - 1)); // 向左
		test(maze, new Point(p.x - 1, p.y)); // 向上
		if (!maze.isArrived())
			maze.empty(p); // 如果還沒有到達出口，則回退
	}

	private static void test(Maze maze, Point p) {
		// 如果當前點還是空地且還沒到達出口，遞迴進行搜尋
		if (!maze.isArrived() && maze.isEmpty(p))
			go(maze, p);
	}
}