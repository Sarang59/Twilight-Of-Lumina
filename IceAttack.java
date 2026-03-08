public class IceAttack extends Attack 
{
    public IceAttack()
    {
        super();
    }

    public IceAttack(String newName, String newType, int newAttackPoints)
    {
        super(newName, newType, newAttackPoints);
    }

    public String defendAll()
    {
        return "All";
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
        return "Draw";
    }

    public String defendGrass()
    {
        return "Draw";
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
        return "Ice";
    }

    public String toString()
    {
        return super.toString();
    }
}
