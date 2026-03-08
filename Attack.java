abstract class Attack 
{
    private String name;
    private String type;
    private int attackPoints;

    public Attack()
    {
        this.name = "";
        this.type = "";
        this.attackPoints = 0;
    }

    public Attack(String newName, String newType, int newAttackPoints)
    {
        this.setName(newName);
        this.setType(newType);
        this.setAttackPoints(newAttackPoints);
    }

    abstract String defendDark();

    abstract String defendDefensiveAttacks();
    
    abstract String defendFire();

    abstract String defendGrass();

    abstract String defendSupportMagic();

    abstract String defendIce();
    
    abstract String defendMagic();

    abstract String defendPoison();

    abstract String defendPhysical();

    public int getAttackPoints()
    {
        return this.attackPoints;
    }

    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public void setAttackPoints(int newAttackPoints)
    {
        Validation valid = new Validation();

        if(!valid.checkNegativeNumber(newAttackPoints))
            this.attackPoints = newAttackPoints;
        else
            this.attackPoints = 0;
    }

    public void setName(String newName)
    {
        Validation valid = new Validation();

        if(!valid.checkAlphabeticStringOrNot(newName.toLowerCase())
		|| valid.checkEmptyString(newName)
		|| valid.checkStartAndEndWithWhiteSpace(newName))
			this.name = "";
        else
            this.name = newName;
    }

    public void setType(String newType)
    {
        Validation valid = new Validation();

        if(!valid.checkAlphabeticStringOrNot(newType.toLowerCase())
		|| valid.checkEmptyString(newType)
		|| valid.checkStartAndEndWithWhiteSpace(newType))
			this.type = "";
        else
            this.type = newType;
    }
    
    public String toString()
    {
        String result = String.format(" %-37s | %-10s | %-3d ",
									  this.name, this.type, this.attackPoints);
		return result;
    }
}
