import java.util.ArrayList;

public class Phoenix extends EvilCreature
{
    public Phoenix()
    {
        super();
    }

    public Phoenix(int newHealthPoints, String newIdentity, String newGender,
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
            return "Phoenix";
    }

	public String fightCleric(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Fire")
            return "Phoenix";
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
            return "Phoenix";
    }

	public String fightGuide(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Fire")
            return "Phoenix";
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
            return "Phoenix";
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
                return "Phoenix";
        }
        else
        {
            String conclusion = attack.defendMagic();

            if(conclusion == "Fire")
                return "Phoenix";
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
            return "Phoenix";
    }

	public String fightWizard(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 2);

        if(probability != 1)
            return "Wizard";
        else
            return "Phoenix";
    }

    public String toString()
    {
        return super.toString();
    }
}
