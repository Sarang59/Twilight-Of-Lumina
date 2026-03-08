abstract class Hero extends Creature
{
	private int maxHealthPoints;

	public Hero()
	{
		super();

	}

	public Hero(int newHealthPoints, String newIdentity, String newGender, 
			   String newCry, String newLaugh, boolean newIsAlive,  
			   Attack newAttack, int newMaxHealthPoints)
	{
		super(newHealthPoints, newIdentity, newGender, newCry, 
			  newLaugh, newIsAlive, newAttack);
		
		this.maxHealthPoints = newMaxHealthPoints;
	}

	abstract String fightElderTreant(Attack attack);

	abstract String fightGoblin(Attack attack);

	abstract String fightOrc(Attack attack);

	abstract String fightTroll(Attack attack);

	abstract String fightVineWraith(Attack attack);

	abstract String fightWoodGolem(Attack attack);

	public int getMaxHealthPoints()
	{
		return this.maxHealthPoints;
	}

	public void setMaxHealthPoints(int newMaxHealthPoints)
	{
		this.maxHealthPoints = newMaxHealthPoints;
	}

	public String toString(String extraInfo, boolean flag)
	{
		String finalResult = "";
		if(flag)
		{
			finalResult = String.format("%-50s %-10s |",
									  super.toString(), extraInfo);
		}
		else
		{
			finalResult = String.format("%-50s %-10s |",
									  super.toString(), " - ");
		}
		
		return finalResult;
	}
}