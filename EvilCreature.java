import java.util.ArrayList;

abstract class EvilCreature extends Creature
{
	private boolean hasItem;
	private ArrayList<String> itemName;

	public EvilCreature()
	{
		super();
		this.hasItem = false;
		this.itemName = new ArrayList<String>();
	}

	public EvilCreature(int newHealthPoints, String newIdentity, String newGender, 
						String newCry, String newLaugh, boolean newIsAlive, 
						Attack newAttack, boolean newHasItem,
						ArrayList<String> newItemName)
	{
		super(newHealthPoints, newIdentity, newGender, newCry,
			  newLaugh, newIsAlive, newAttack);

		this.hasItem = newHasItem;
		this.itemName = newItemName;
	}

	abstract String fightBrawler(Attack attack);

	abstract String fightCleric(Attack attack);

	abstract String fightCrusader(Attack attack);

	abstract String fightGuide(Attack attack);

	abstract String fightKnight(Attack attack);

	abstract String fightLeader(Attack attack);

	abstract String fightRouge(Attack attack);

	abstract String fightWizard(Attack attack);

	public ArrayList<String> getItemName()
	{
		return this.itemName;
	}

	public boolean getHasItem()
	{
		return this.hasItem;
	}

	public void setItemName(ArrayList<String> newItemName)
	{
		this.itemName = newItemName;
	}

	public void setHasItem(boolean newHasItem)
	{
		this.hasItem = newHasItem;
	}

	public String toString()
	{
		return super.toString();
	}
}