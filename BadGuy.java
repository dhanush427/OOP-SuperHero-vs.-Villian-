public class BadGuy extends SuperHero {

	private String evilLaugh;

	public BadGuy(String name, String job, int hitPoint,int maxDamage, int defenseAbility, String superpower, boolean cape, int powerLevel, String heroName, String catchPhrase, String evilLaugh){
		super(name, job, hitPoint, maxDamage, defenseAbility, superpower, cape, powerLevel, heroName);
		this.evilLaugh = evilLaugh;
	}

	public String getevilLaugh() {
		return evilLaugh;
	}

}