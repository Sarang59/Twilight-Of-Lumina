import java.util.ArrayList;

public class VineWraith extends EvilCreature 
{
    public VineWraith()
    {
        super();
    }

    public VineWraith(int newHealthPoints, String newIdentity, 
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

        if(conclusion == "Grass")
            return "Vine Wraith";
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

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Crusader";
    }

	public String fightGuide(Attack attack)
    {
        String conclusion = attack.defendSupportMagic();

        if(conclusion == "Grass")
            return "Vine Wraith";
        else
            return "Guide";
    }

	public String fightKnight(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Grass")
            return "Vine Wraith";
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

            if(conclusion == "Grass")
                return "Elder Treant";
            else
                return "Leader";
        }
        else
        {
            String conclusion = attack.defendMagic();

            if(conclusion == "Grass")
                return "Elder Treant";
            else
                return "Leader";
        }
    }

	public String fightRouge(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Grass")
            return "Vine Wraith";
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
