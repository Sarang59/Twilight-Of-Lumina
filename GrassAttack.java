public class GrassAttack extends Attack 
{
    public GrassAttack()
    {
        super();
    }

    public GrassAttack(String newName, String newType, int newAttackPoints)
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
        return "Fire";
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
        return "Draw";
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
        return "Grass";
    }

    public String toString()
    {
        return super.toString();
    }
}
