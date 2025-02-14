package Unit6;

public class RPG4 {

	public static void main(String[] args) {
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);

		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.println(swordsMan.toString());
		System.out.println(magician.toString());
	}

}
