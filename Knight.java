public class Knight extends Hero 
{
    public Knight()
    {
        super();
    }

    public Knight(int newHealthPoints, String newIdentity, String newGender,
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
            return "Knight";
    }

	public String fightGoblin(Attack attack)
    {
        return "Knight";
    }

	public String fightOrc(Attack attack)
    {
        return "Knight";
    }

	public String fightTroll(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Knight";
        else
            return "Troll";
    }

	public String fightVineWraith(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Knight";
    }

	public String fightWoodGolem(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Knight";
        else
            return "Troll";
    }

    public String toString()
    {
        return super.toString("", false);
    }
}
