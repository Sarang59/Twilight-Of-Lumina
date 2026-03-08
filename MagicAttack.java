public class MagicAttack extends Attack 
{
    public MagicAttack()
    {
        super();
    }

    public MagicAttack(String newName, String newType, int newAttackPoints)
    {
        super(newName, newType, newAttackPoints);
    }
    
    public String defendDark()
    {
        return "Magic";
    }

    public String defendDefensiveAttacks()
    {
        return "Neutral";
    }

    public String defendFire()
    {
        return "Draw";
    }

    public String defendGrass()
    {
        return "Magic";
    }

    public String defendSupportMagic()
    {
        return "Magic";
    }

    public String defendIce()
    {
        return "Magic";
    }

    public String defendMagic()
    {
        return "Neutral";
    }

    public String defendPoison()
    {
        return "Magic";
    }
    
    public String defendPhysical()
    {
        return "Draw";
    }

    public String toString()
    {
        return super.toString();
    }
}
