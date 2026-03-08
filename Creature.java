abstract class Creature
{
	private int healthPoints;
	private String identity;
	private String gender;
	private String cry;
	private String laugh;
	private boolean isAlive;
	private Attack attack;
	
	public Creature()
	{
		this.healthPoints = 0;
		this.identity = "Unknown";
		this.gender = "Unknown";
		this.cry = "Unknown";
		this.laugh = "Unknown";
		this.isAlive = true;
		this.attack = null;
	}

	public Creature(int newHealthPoints, String newIdentity, String newGender, 
					String newCry, String newLaugh, boolean newIsAlive, 
					Attack attack)
	{
		this.setHealthPoints(newHealthPoints);
		this.setIdentity(newIdentity);
		this.setGender(newGender);
		this.setCry(newCry);
		this.setLaugh(newLaugh);
		this.setIsAlive(newIsAlive);
		this.setWeapons(attack);
	}

	public void display()
	{
		System.out.println("Creature Information is: ");
		System.out.println("Health Points are: " + this.healthPoints);
		System.out.println("Identity is: " + this.identity);
		System.out.println("Gender is: " + this.gender);
		System.out.println("Cry is:" +  this.cry);
		System.out.println("Laugh is: " + this.laugh);
		System.out.println("Is Alive?: " + this.isAlive);
		System.out.println("Weapons are: " + this.attack);
	}

	public String getCry()
	{
		return this.cry;
	}

	public String getGender()
	{
		return this.gender;
	}

	public int getHealthPoints()
	{
		return this.healthPoints;
	}

	public String getIdentity()
	{
		return this.identity;
	}

	public boolean getIsAlive()
	{
		return this.isAlive;
	}

	public String getLaugh()
	{
		return this.laugh;
	}

	public Attack getWeapons()
	{
		return this.attack;
	}

	public void setCry(String newCry)
	{
		Validation valid = new Validation();

		if(!valid.checkEmptyString(newCry)
			&& valid.checkAlphabeticStringOrNot(newCry.toLowerCase())
			&& !valid.checkStartAndEndWithWhiteSpace(newCry))
			this.cry = newCry;
		else
			this.cry = "Unknown";
	}

	public void setGender(String newGenderCode)
	{
		Validation valid = new Validation();

		if(!valid.checkEmptyString(newGenderCode)
			&& valid.checkAlphabeticStringOrNot(newGenderCode.toLowerCase())
			&& !valid.checkStartAndEndWithWhiteSpace(newGenderCode))
			this.gender = newGenderCode;
		else
			this.gender = "Unknown";
	}

	public void setHealthPoints(int newHealthPoints)
	{
		Validation valid = new Validation();

		if(!valid.checkNegativeNumber(newHealthPoints))
			this.healthPoints = newHealthPoints;
		else
			this.healthPoints = 0;
	}

	public void setIdentity(String newIdentity)
	{
		Validation valid = new Validation();

		if(!valid.checkEmptyString(newIdentity)
			&& valid.checkAlphabeticStringOrNot(newIdentity.toLowerCase())
			&& !valid.checkStartAndEndWithWhiteSpace(newIdentity))
			this.identity = newIdentity;
		else
			this.identity = "Unknown";
	}

	public void setIsAlive(boolean newIsAlive)
	{
		this.isAlive = newIsAlive;
	}

	public void setLaugh(String newLaugh)
	{
		Validation valid = new Validation();

		if(!valid.checkEmptyString(newLaugh)
			&& valid.checkAlphabeticStringOrNot(newLaugh.toLowerCase())
			&& !valid.checkStartAndEndWithWhiteSpace(newLaugh))
			this.laugh = newLaugh;
		else
			this.laugh = "Unknown";
	}

	public void setWeapons(Attack newAttack)
	{
		this.attack = newAttack;
	}

	public String toString()
	{
		String result = String.format("| %-4d | %-20s | %-2s | %-40s " 
									+ "| %-6s |",
									  this.healthPoints, this.identity, 
									  this.gender, this.attack, 
									  isAlive ? "Alive" : "Dead");
		return result;
	}
}