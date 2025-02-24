package Unit6;

import java.util.Scanner;

public class Guest {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		collectNameTo(names);
		System.out.println("訪客名稱:");
		printUpperCase(names);
	}

	static void collectNameTo(ArrayList names) {
		while (true) {
			Scanner userInput = new Scanner(System.in);
			System.out.print("訪客名稱:");
			var name = userInput.nextLine();
			if(name.equals("quit")) {
				break;
			}
			names.add(name);
		}

	}
	static void printUpperCase(ArrayList names) {
		for(int i=0 ; i<names.size();i++) {
			var name = (String)names.get(i);
			System.out.println(name.toUpperCase());
		}
	}

}
