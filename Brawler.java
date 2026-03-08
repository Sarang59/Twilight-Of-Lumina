public class Brawler extends Hero 
{
    public Brawler()
    {
        super();
    }

    public Brawler(int newHealthPoints, String newIdentity, String newGender,
                   String newCry, String newLaugh, boolean newIsAlive, 
                   Attack newAttack, int newMaxHealthPoints)
    {
        super(newHealthPoints, newIdentity, newGender, newCry, 
              newLaugh, newIsAlive, newAttack, newMaxHealthPoints);
    }

    public String fightElderTreant(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Elder Treant";
        else
            return "Brawler";
    }

	public String fightGoblin(Attack attack)
    {
        return "Brawler";
    }

	public String fightOrc(Attack attack)
    {
        return "Brawler";
    }

	public String fightTroll(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Brawler";
        else
            return "Troll";
    }

	public String fightVineWraith(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Brawler";
    }

	public String fightWoodGolem(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 3);

        if(probability != 1)
            return "Brawler";
        else
            return "Wood Golem";
    }

    public String toString()
    {
        return super.toString("", false);
    }
}
