import java.util.ArrayList;

public class BlazingDragon extends EvilCreature
{
    public BlazingDragon()
    {
        super();
    }

    public BlazingDragon(int newHealthPoints, String newIdentity, 
                          String newGender, String newCry, String newLaugh, 
                          boolean newIsAlive, Attack newAttack, 
                          boolean newHasItem, ArrayList<String> newItemName)
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
            return "Infernal Dragon";
    }

	public String fightCleric(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Fire")
            return "Infernal Dragon";
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
            return "Infernal Dragon";
    }

	public String fightGuide(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Fire")
            return "Infernal Dragon";
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
            return "Infernal Dragon";
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
                return "Infernal Dragon";
        }
        else
        {
            String conclusion = attack.defendMagic();

            if(conclusion == "Fire")
                return "Infernal Dragon";
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
            return "Infernal Dragon";
    }

	public String fightWizard(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 2);

        if(probability != 1)
            return "Wizard";
        else
            return "Infernal Dragon";
    }

    public String toString()
    {
        return super.toString();
    }
}
