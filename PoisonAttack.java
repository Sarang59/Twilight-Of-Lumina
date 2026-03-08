public class PoisonAttack extends Attack 
{
    public PoisonAttack()
    {
        super();
    }

    public PoisonAttack(String newName, String newType, int newAttackPoints)
    {
        super(newName, newType, newAttackPoints);
    }

    public String defendDark()
    {
        return "Draw";
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
        return "Poison";
    }

    public String defendSupportMagic()
    {
        return "Poison";
    }

    public String defendIce()
    {
        return "Poison";
    }

    public String defendMagic()
    {
        return "Neutral";
    }

    public String defendPoison()
    {
        return "Neutral";
    }
    
    public String defendPhysical()
    {
        return "Poison";
    }

    public String toString()
    {
        return super.toString();
    }
}
