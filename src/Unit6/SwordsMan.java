package Unit6;

public class SwordsMan extends Role {
	@Override
	public void fight() {
		System.out.println("揮劍攻擊");
	}
	@Override
	public String toString() {
		return "劍士"+super.toString();
	}
}
