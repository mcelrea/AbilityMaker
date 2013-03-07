
public class Ability {
	
	private String name;
	private int minDamage, maxDamage;
	
	public Ability()
	{
		name = "ERROR";
		minDamage = -1;
		maxDamage = -1;
	}
	
	public Ability(String name, int minDamage, int maxDamage) {
		super();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinDamage() {
		return minDamage;
	}

	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

}
