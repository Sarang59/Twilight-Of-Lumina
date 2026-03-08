public class Crusader extends Hero 
{
    public Crusader()
    {
        super();
    }

    public Crusader(int newHealthPoints, String newIdentity, String newGender,
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
            return "Crusader";
    }

	public String fightGoblin(Attack attack)
    {
        return "Crusader";
    }

	public String fightOrc(Attack attack)
    {
        return "Crusader";
    }

	public String fightTroll(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Crusader";
        else
            return "Troll";
    }

	public String fightVineWraith(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Crusader";
    }

	public String fightWoodGolem(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 3);

        if(probability != 1)
            return "Crusader";
        else
            return "Wood Golem";
    }

    public String toString()
    {
        return super.toString("", false);
    }
}
