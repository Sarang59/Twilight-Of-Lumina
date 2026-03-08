//import java.util.*;

abstract class Potion
{
	private String name;
	private String description;

	public Potion()
	{
		this.name = "Unknown";
		this.description = "Unknown";
	}

	public Potion(String newName, String newDescription)
	{
		this.setName(newName);
		this.setDescription(newDescription);
	}

	public String getName()
	{
		return this.name;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}

	public void setDescription(String newDescription)
	{
		this.description = newDescription;
	}

	public String toString()
	{
		String result = "";

		result = "| " + this.name + " | " + this.description;

		return result;
	}
}