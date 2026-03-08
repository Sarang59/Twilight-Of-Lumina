import java.util.ArrayList;

public class WoodGolem extends EvilCreature
{
    public WoodGolem()
    {
        super();
    }

    public WoodGolem(int newHealthPoints, String newIdentity, String newGender,
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
        int probability = rng.getRandomNumber(0, 3);

        if(probability != 1)
            return "Brawler";
        else
            return "Wood Golem";
    }

	public String fightCleric(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Physical")
            return "Wood Golem";
        else
            return "Neutral";
    }

	public String fightCrusader(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 3);

        if(probability != 1)
            return "Crusader";
        else
            return "Wood Golem";
    }

	public String fightGuide(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Physical")
            return "Wood Golem";
        else
            return "Neutral";
    }

	public String fightKnight(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 3);

        if(probability != 1)
            return "Knight";
        else
            return "Wood Golem";
    }

	public String fightLeader(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 1)
        {
            int decision = rng.getRandomNumber(0, 3);

            if(decision != 1)
                return "Leader";
            else
                return "Wood Golem";
        }
        else
        {
            String conclusion = attack.defendMagic();

            if(conclusion == "Grass")
                return "Wood Golem";
            else
                return "Leader";
        }
    }

	public String fightRouge(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 3);

        if(probability != 1)
            return "Rouge";
        else
            return "Wood Golem";
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
