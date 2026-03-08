import java.util.ArrayList;

public class FieryScamp extends EvilCreature
{
    public FieryScamp()
    {
        super();
    }

    public FieryScamp(int newHealthPoints, String newIdentity,
                      String newGender, String newCry, String newLaugh, 
                      boolean newIsAlive, Attack newAttack, boolean newHasItem,
                      ArrayList<String> newItemName)
    {
        super(newHealthPoints, newIdentity, newGender, newCry, newLaugh,
              newIsAlive, newAttack, newHasItem, newItemName);
    }

    public String fightBrawler(Attack attack)
    {
        return "Brawler";
    }

	public String fightCleric(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Physical")
            return "Fiery Scamp";
        
        return "Neutral";
    }

	public String fightCrusader(Attack attack)
    {
        return "Crusader";
    }

	public String fightGuide(Attack attack)
    {
        String conclusion = attack.defendPhysical();

        if(conclusion == "Physical")
            return "Fiery Scamp";
        
        return "Neutral";
    }

	public String fightKnight(Attack attack)
    {
        return "Knight";
    }

	public String fightLeader(Attack attack)
    {
        return "Leader";
    }

	public String fightRouge(Attack attack)
    {
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
