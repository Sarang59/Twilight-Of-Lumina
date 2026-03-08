public class SupportAttack extends Attack 
{
    public SupportAttack()
    {
        super();
    }
    
    public SupportAttack(String newName, String newType, int newAttackPoints)
    {
        super(newName, newType, newAttackPoints);
    }

    public String defendDark()
    {
        return "Dark";
    }

    public String defendDefensiveAttacks()
    {
        return "Neutral";
    }

    public String defendFire()
    {
        return "Neutral";
    }

    public String defendGrass()
    {
        return "Neutral";
    }

    public String defendSupportMagic()
    {
        return "Neutral";
    }

    public String defendIce()
    {
        return "Neutral";
    }

    public String defendMagic()
    {
        return "Magic";
    }

    public String defendPoison()
    {
        return "Poison";
    }
    
    public String defendPhysical()
    {
        return "Neutral";
    }

    public String toString()
    {
        return super.toString();
    }
}
