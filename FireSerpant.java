import java.util.ArrayList;

public class FireSerpant extends EvilCreature
{
    public FireSerpant()
    {
        super();
    }

    public FireSerpant(int newHealthPoints, String newIdentity,
                      String newGender, String newCry, String newLaugh, 
                      boolean newIsAlive, Attack newAttack,
                      boolean newHasItem, ArrayList<String> newItemName)
    {
        super(newHealthPoints, newIdentity, newGender, 
              newCry, newLaugh, newIsAlive, newAttack, newHasItem, 
              newItemName);
    }

    public String fightBrawler(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Fire")
            return "Fire Serpant";
        else
            return "Brawler";
    }

	public String fightCleric(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Neutral";
    }

	public String fightCrusader(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Fire")
            return "Fire Serpant";
        else
            return "Crusader";
    }

	public String fightGuide(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Fire")
            return "Fire Serpant";
        else
            return "Guide";
    }

	public String fightKnight(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Fire")
            return "Fire Serpant";
        else
            return "Knight";
    }

	public String fightLeader(Attack attack)
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int probability = rng.getRandomNumber(0, 4);

        if(probability != 1)
        {
            String conclusion = attack.defendPhysical();

            if(conclusion == "Fire")
                return "Fire Serpant";
            else
                return "Leader";
        }
        else
        {
            String conclusion = attack.defendMagic();

            if(conclusion == "Fire")
                return "Fire Serpant";
            else
                return "Leader";
        }
    }

	public String fightRouge(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Fire")
            return "Fire Serpant";
        else
            return "Rouge";
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
