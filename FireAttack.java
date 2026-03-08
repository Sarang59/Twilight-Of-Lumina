public class FireAttack extends Attack 
{
    public FireAttack()
    {
        super();
    }

    public FireAttack(String newName, String newType, int newAttackPoints)
    {
        super(newName, newType, newAttackPoints);
    }

    public String defendAll()
    {
        return "Draw";
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
        return "Neutral";
    }

    public String defendGrass()
    {
        return "Fire";
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
        return "Neutral";
    }

    public String defendPoison()
    {
        return "Draw";
    }
    
    public String defendPhysical()
    {
        return "Fire";
    }

    public String toString()
    {
        return super.toString();
    }
}
