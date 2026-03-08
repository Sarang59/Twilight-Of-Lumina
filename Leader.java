public class Leader extends Hero 
{
    private int numberOfCrystal = 0; 

    public Leader()
    {
        super();

        this.numberOfCrystal = 0;
    }

    public Leader(int newHealthPoints, String newIdentity, String newGender, 
                  String newCry, String newLaugh, boolean newIsAlive, 
                  Attack newAttack, int newMaxHealthPoints, 
                  int newNumberOfCrystal)
    {
        super(newHealthPoints, newIdentity, newGender, newCry, 
              newLaugh, newIsAlive, newAttack, newMaxHealthPoints);
        
        this.setNumberOfCrystal(newNumberOfCrystal);;
    }

    public String fightElderTreant(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Elder Treant";
        else
            return "Leader";
    }

	public String fightGoblin(Attack attack)
    {
        return "Leader";
    }

	public String fightOrc(Attack attack)
    {
        return "Leader";
    }

	public String fightTroll(Attack attack)
    {
        return "Leader";
    }

	public String fightVineWraith(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Leader";
    }

	public String fightWoodGolem(Attack attack)
    {
        if(attack.getType() == "Magic")
        {
            RandomNumberGenerator rng = new RandomNumberGenerator();
            int probability = rng.getRandomNumber(0, 4);

            if(probability != 2)
                return "Leader";
            else
                return "Wood Golem";

        }
        else
        {
            RandomNumberGenerator rng = new RandomNumberGenerator();
            int probability = rng.getRandomNumber(0, 4);

            if(probability != 2)
                return "Leader";
            else
                return "Wood Golem";
        }
    }

    public int getNumberOfCrystal()
	{
		return this.numberOfCrystal;
	}

	public void setNumberOfCrystal(int newNumberOfCrystal)
	{
		this.numberOfCrystal = newNumberOfCrystal;
	}

    public String toString()
    {
        String extraInfo = numberOfCrystal + " Crystals";

        return super.toString(extraInfo, true);
    }
}
