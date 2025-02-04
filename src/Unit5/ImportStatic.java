package Unit5;
import static java.lang.System.*;
//import static java.lang.System.out;

import java.util.Scanner;
public class ImportStatic {

	public static void main(String[] args) {
		var console = new Scanner(in);
		out.print("輸入你的名子:");
		out.printf("%s 你好!", console.nextLine());
	}

}
