public class GoodGuy extends SuperHero {

	private String catchPhrase;

	public GoodGuy(String name, String job, int hitPoint,int maxDamage, int defenseAbility, String superpower, boolean cape, int powerLevel, String heroName, String catchPhrase){
		super(name, job, hitPoint, maxDamage, defenseAbility, superpower, cape, powerLevel, heroName);
		this.catchPhrase = catchPhrase;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void powerLevelModification()
	{
		int x = (int)(Math.random()*10)+1;
		setPowerLevel(getPowerLevel() + x);
	}

}
