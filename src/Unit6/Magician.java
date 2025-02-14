package Unit6;

public class Magician extends Role{
	
	public void cure() {
		System.out.println("魔法治癒");
	}

	@Override
	public void fight() {
		System.out.println("魔法攻擊");
	}
	@Override
	public String toString() {
		return "魔法師"+super.toString();
	}
}
