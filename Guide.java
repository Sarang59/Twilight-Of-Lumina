public class Guide extends Hero 
{
    public Guide()
    {
        super();
    }

    public Guide(int newHealthPoints, String newIdentity, String newGender, 
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
            return "Neutral";
    }

	public String fightGoblin(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Physical")
            return "Goblin";
        else
            return "Neutral";
    }

	public String fightOrc(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Physical")
            return "Orc";
        else
            return "Neutral";
    }

	public String fightTroll(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Physical")
            return "Troll";
        else
            return "Neutral";
    }

	public String fightVineWraith(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Neutral";
    }

	public String fightWoodGolem(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Physical")
            return "Wood Golem";
        else
            return "Neutral";
    }

    public String toString()
    {
        return super.toString("", false);
    }
}
