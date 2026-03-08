import java.util.ArrayList;

public class Cleric extends Hero 
{
    private boolean hasPotion; 
    private ArrayList<String> potionName;

    public Cleric()
    {
        super();

        this.hasPotion = false;
        this.potionName = new ArrayList<String>();
    }

    public Cleric(int newHealthPoints, String newIdentity, String newGender, 
                  String newCry, String newLaugh, boolean newIsAlive, 
                  Attack newAttack, int newMaxHealthPoints, 
                  boolean newHasPotion, ArrayList<String> newPotionName)
    {
        super(newHealthPoints, newIdentity, newGender, newCry, 
              newLaugh, newIsAlive, newAttack, newMaxHealthPoints);
        
        this.setHasPotion(newHasPotion);
        this.setPotionName(newPotionName);
    }

    // Display Method Overriding to show the Potions

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

    public boolean getHasPotion()
    {
        return this.hasPotion;
    }

    public ArrayList<String> getPotionName()
    {
        return this.potionName;
    }

    public void setHasPotion(boolean newHasPotion)
    {
        this.hasPotion = newHasPotion;
    }

    public void setPotionName(ArrayList<String> newPotionName)
    {
        this.potionName = newPotionName;
    }

    public String toString()
    {
        String extraInfo = this.potionName.size() + " Potions";
        return super.toString(extraInfo, true);
    }
}
