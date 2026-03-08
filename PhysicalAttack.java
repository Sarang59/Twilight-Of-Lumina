public class PhysicalAttack extends Attack 
{
    public PhysicalAttack()
    {
        super();
    }

    public PhysicalAttack(String newName, String newType, int newAttackPoints)
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
        return "Fire";
    }

    public String defendGrass()
    {
        return "Grass";
    }

    public String defendSupportMagic()
    {
        return "Physical";
    }

    public String defendIce()
    {
        return "Ice";
    }

    public String defendMagic()
    {
        return "Draw";
    }

    public String defendPoison()
    {
        return "Poison";
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
