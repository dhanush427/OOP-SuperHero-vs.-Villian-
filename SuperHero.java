public class SuperHero extends Person {

	private String superPower;
	private boolean cape;
	private int powerLevel;
	private String heroName;

	public SuperHero(String name, String job, int hitPoint,int maxDamage, int defenseAbility, String superpower, boolean cape, int powerLevel, String heroName) {

		super(name, job, hitPoint, maxDamage,defenseAbility );
		this.superPower = superPower;
		this.cape = cape;
		this.powerLevel = powerLevel;
		this.heroName = heroName;

	}

	public String getSuperpower() {
		return superPower;
	}
	public boolean getCape() {
		return cape;
	}
	public int getPowerLevel(){
		return powerLevel;
	}
	public String getHeroName()
	{
		return heroName;
	}
	public void setPowerLevel(int x){
			powerLevel = x;
	}
	public void powerLevelModification(int newLevel)
	{
		powerLevel = newLevel;
	}

}