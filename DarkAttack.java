public class DarkAttack extends Attack 
{
    public DarkAttack()
    {
        super();
    }

    public DarkAttack(String newName, String newType, int newAttackPoints)
    {
        super(newName, newType, newAttackPoints);
    }

    public String defendAll()
    {
        return "Draw";
    }

    public String defendDark()
    {
        return "Neutral";
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
        return "Dark";
    }

    public String defendSupportMagic()
    {
        return "Dark";
    }

    public String defendIce()
    {
        return "Draw";
    }

    public String defendMagic()
    {
        return "Neutral";
    }

    public String defendPoison()
    {
        return "Draw";
    }
    
    public String defendPhysical()
    {
        return "Dark";
    }

    public String toString()
    {
        return super.toString();
    }
}
