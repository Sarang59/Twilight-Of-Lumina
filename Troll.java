import java.util.ArrayList;

public class Troll extends EvilCreature 
{
    public Troll()
    {
        super();
    }

    public Troll(int newHealthPoints, String newIdentity, String newGender, 
                String newCry, String newLaugh, boolean newIsAlive, 
                Attack newAttack, boolean newHasItem, 
                ArrayList<String> newItemName)
    {
        super(newHealthPoints, newIdentity, newGender, newCry, newLaugh, 
              newIsAlive, newAttack, newHasItem, newItemName);
    }

    public String fightBrawler(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Brawler";
        else
            return "Troll";
    }

	public String fightCleric(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Physical")
            return "Troll";
        else
            return "Neutral";
    }

	public String fightCrusader(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Crusader";
        else
            return "Troll";
    }

	public String fightGuide(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Physical")
            return "Troll";
        else
            return "Neutral";
    }

	public String fightKnight(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Knight";
        else
            return "Troll";
    }

	public String fightLeader(Attack attack)
    {
        return "Leader";
    }

	public String fightRouge(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 2)
            return "Rouge";
        else
            return "Troll";
    }

	public String fightWizard(Attack attack)
    {
        return "Wizard";
    }

    public String toString()
    {
        return super.toString();
    }
}
