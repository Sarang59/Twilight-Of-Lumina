public class Wizard extends Hero 
{
    private int numberOfKeys;

    public Wizard()
    {
        super();

        this.numberOfKeys = 0;
    }

    public Wizard(int newHealthPoints, String newIdentity, String newGender, 
                  String newCry, String newLaugh, boolean newIsAlive, 
                  Attack newAttack, int newMaxHealthPoints, int newNumberOfKeys)
    {
        super(newHealthPoints, newIdentity, newGender, newCry, 
              newLaugh, newIsAlive, newAttack, newMaxHealthPoints);
        
        this.numberOfKeys = newNumberOfKeys;
    }

    public String fightElderTreant(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Elder Treant";

        return "Wizard";
    }

	public String fightGoblin(Attack attack)
    {
        return "Wizard";
    }

	public String fightOrc(Attack attack)
    {
        return "Wizard";
    }

	public String fightTroll(Attack attack)
    {
        return "Wizard";
    }

	public String fightVineWraith(Attack attack)
    {
        String conclusion = attack.defendGrass();

        if(conclusion == "Grass")
            return "Vine Wraith";
            
        return "Wizard";
    }

	public String fightWoodGolem(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Physical")
            return "Wood Golem";
            
        return "Wizard";
    }

    public int getNumberOfKeys()
    {
        return this.numberOfKeys;
    }

    public void setNumberOfKeys(int newNumberOfKeys)
    {
        this.numberOfKeys = newNumberOfKeys;
    }

    public String toString()
    {
        String extraInfo = this.numberOfKeys + " Keys";
        return super.toString(extraInfo, true);
    }
}
