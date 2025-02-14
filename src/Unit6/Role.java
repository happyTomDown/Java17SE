package Unit6;

public abstract class Role {
	private String name;
	private int level;
	private int blood;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}
	public abstract void fight() ;
	
	@Override
	public String toString() {
	return "(%s,%d,%d)".formatted(this.name,this.level,this.blood);
	}

}
	
