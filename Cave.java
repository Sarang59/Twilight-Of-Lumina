import java.util.ArrayList;

public class Cave
{
	private int caveId;
	private int[] caveDirection;
	private boolean hasEnemy;
	private EvilCreature enemy;
	private boolean hasPotion;
	private String tonic;
	
	public Cave()
	{
		this.caveId = 0;
		this.caveDirection = new int[4];
		this.hasEnemy = false;
		this.enemy = null;
		this.hasPotion = false;
		this.tonic = null;
	}

	public Cave(int newCaveId, int[] newCaveDirection, boolean newHasEnemy,
				EvilCreature newEnemy, boolean newHasPotion, String newTonic)
	{
		this.setCaveId(newCaveId);
		this.setCaveDirection(newCaveDirection);
		this.setHasEnemy(newHasEnemy);
		this.setEnemy(newEnemy);
		this.setHasPotion(newHasPotion);
		this.setTonic(newTonic);
	}

	public String choosePotion(String potionCode)
	{
		switch(potionCode)
		{
			case "DAP":
				return "Double Attack Potion";
			case "HP":
				return "Healing Potion";
			case "IP":
				return "Invisible Potion";
			case "LP":
				return "Love Potion";
			case "RP":
				return "Revive Potion";
			case "TP":
				return "Teleport Potion";
			default:
				System.out.println("Invalid Code...!");
		}

		return null;
	}

	public void display()
	{
		System.out.println("Cave Information is as follows: ");
		System.out.println("Cave Id: " + this.caveId);
		System.out.print("Cave Directions are: ");
		for(int temp: this.caveDirection)
			System.out.print(temp + " ");
		System.out.println("");
		System.out.println(hasEnemy? this.enemy.getIdentity() 
						   : "No Enemy");
		System.out.println(hasPotion? this.choosePotion(this.tonic) : 
							"No Potion");
	}

	public EvilCreature chooseEnemy(String choice)
	{
		switch(choice)
		{
			case "D":
				Attack blazingDragonAttack = new FireAttack("Flame Thrower", 
															"Fire", 50);
				ArrayList<String> itemsWithBlazingDragon = 
													new ArrayList<String>();
				itemsWithBlazingDragon.add("Crystal");
				itemsWithBlazingDragon.add(this.choosePotion(this.tonic));
				
				EvilCreature blazingDragon = new BlazingDragon(200, 
													"Dragon",
													"M", 
													"My flames are" +
													" extinguished....!",
													"Fwohohohoho",
													true, 
													blazingDragonAttack,
													true, 
													itemsWithBlazingDragon);
				return blazingDragon;
			case "ET":
				Attack elderTreantAttack = new GrassAttack("Wild Vipe", 
														   "Grass", 50);
				
				ArrayList<String> itemsWithElderTreant = 
													new ArrayList<String>();
				itemsWithElderTreant.add("Crystal");
				itemsWithElderTreant.add(choosePotion(this.tonic));
				
				EvilCreature elderTreant = new ElderTreant(200, "Elder Treant",
												"M", "The forest Weeps....!",
												"Eeeehihihi", true,
												elderTreantAttack, true,
												itemsWithElderTreant);
				return elderTreant;
			case "FSC":
				Attack fieryScampAttack = new FireAttack("Fire Dart", "Fire",
														 20);
				
				ArrayList<String> itemsWithFieryScamp = 
													new ArrayList<String>();
				itemsWithFieryScamp.add(choosePotion(this.getTonic()));
				
				EvilCreature fieryScamp = new FieryScamp(100, "Fiery Scamp", 
												"M", "Next meet will be" 
												+ " much more fiery...!", 
												"Scahahahaha", true, 
												fieryScampAttack, true,
												itemsWithFieryScamp);
				return fieryScamp;
			case "FSE":
				Attack fireSerpantAttack = new FireAttack("Fire Fangs", "Fire",
														  30);
				
				ArrayList<String> itemsWithFireSerpant = 
													new ArrayList<String>();
				itemsWithFireSerpant.add(choosePotion(this.getTonic()));
				
				EvilCreature fireSerpant = new FireSerpant(150, "Fire Serpant",
										"M", "The flames burn no more....!",
										"Shihishishishis", true,
										fireSerpantAttack, true, 
										itemsWithFireSerpant);
				return fireSerpant;
			case "G":
				Attack goblinAttack = new PhysicalAttack("Wooden Club", 
													     "Physical", 20);
				EvilCreature goblin = new Goblin(100, "Goblin", "M",
												"This is not fair at all....!",
												"Gohihihihi", true, 
												goblinAttack, false,
												new ArrayList<String>());
				return goblin;
			case "IE":
				Attack infernalEfreetAttack = new FireAttack("Fire ball", 
															 "Fire", 30);
				ArrayList<String> itemsWithInfernalEfreet = 
													new ArrayList<String>();
				itemsWithInfernalEfreet.add(choosePotion(this.getTonic()));
				
				EvilCreature infernalEfreet = new InfernalEfreet(150, 
												"Infernal Efreet", 
												"M", "My internal" 
												+ " inferno has perished....!",
												"Efififififi", true, 
												infernalEfreetAttack, true, 
												itemsWithInfernalEfreet);
				return infernalEfreet;
			case "LI":
				Attack lavaImpAttack = new FireAttack("Fire Daggers", "Fire",
													 10);
				
				EvilCreature lavaImp = new LavaImp(100, "Lava Imp", "M", 
												   "My magma inside me got" 
												   + "harden....!",
												   "Emimimimimi", true, 
												   lavaImpAttack, false, 
												   new ArrayList<String>());
				return lavaImp;
			case "O":
				Attack orcAttack = new PhysicalAttack("Wooden Stick", 
													  "Physical", 10);
				EvilCreature orc = new Orc(100, "Orc", "M",
										"Jeepers the creepers, I am dead...!", 
										"Aahahahaha", true, orcAttack, false,
										new ArrayList<String>());
				return orc;
			case "P":
				Attack phoenixAttack = new FireAttack("Fire Wing Daggers", 
													  "Fire", 40);
				ArrayList<String> itemsWithPhoenix = new ArrayList<String>();
				itemsWithPhoenix.add("Key");
				
				EvilCreature phoenix = new Phoenix(175, "Phoenix", "M", 
											"I will rise again, someday....!",
											"Phohohohoho", true, phoenixAttack,
											true, itemsWithPhoenix);
				return phoenix;
			case "T":
				Attack trollAttack = new PhysicalAttack("Wooden Axe",
														"Physical", 30);
				ArrayList<String> itemsWithTroll = new ArrayList<String>();
				itemsWithTroll.add(this.choosePotion(this.tonic));
				
				EvilCreature troll = new Troll(150, "Troll", "M",
										"Sorry Sire, I am Crushed....!", 
										"Tohohohoho", true, trollAttack,
										true, itemsWithTroll);
				return troll;
			case "VW":
				Attack vineWraithAttack = new GrassAttack("Laser Leaf", 
														  "Grass", 30);
				
				ArrayList<String> itemsWithVineWraith = new ArrayList<String>();
				itemsWithVineWraith.add(this.choosePotion(this.tonic));
				
				EvilCreature vineWraith = new VineWraith(150, "Vine Wraith", "M",
											"My vines wither away and I lost " 
											+ "my ego....!",
										    "Gerogerogero", true, 
											vineWraithAttack, true,
											itemsWithVineWraith);
				return vineWraith;
			case "WG":
				Attack woodGolemAttack = new PhysicalAttack("Roll out",
													  		"Physical", 40);
				
				ArrayList<String> itemsWithWoodGolem = new ArrayList<String>();
				itemsWithWoodGolem.add("Key");

				EvilCreature woodGolem = new WoodGolem(175, "Wood Golem", "M",
												"I crumble back to my" 
												+ " mother earth...!",
												"Wogogogogo",
												true, woodGolemAttack, true,
												itemsWithWoodGolem);
				return woodGolem;
			default:
				System.out.println("Invalid choice...!");
				break;
		}

		return null;
	}

	public void createCave(String[] caveInformation, int mazeNumber)
	{
		if(mazeNumber >= 1 && mazeNumber <= 5)
		{
			try
			{
				this.caveId = Integer.parseInt(caveInformation[0]);

				int counter = 1;
				for(int index = 0; index < 4; index++)
				{
					this.caveDirection[index] = 
					Integer.parseInt(caveInformation[counter]);
					counter++;
				}

				if(caveInformation[6].equals("Y"))
				{
					this.setHasPotion(true);
					this.setTonic(caveInformation[8]);
				}

				if(caveInformation[5].equals("Y"))
				{
					String enemyAcronym = caveInformation[7];
					EvilCreature opponent = this.chooseEnemy(enemyAcronym);
					this.setHasEnemy(true);;
					this.setEnemy(opponent);
				}
			}
			catch(Exception e)
			{
				System.out.println("Error in creating cave...!");
			}
		}
		else
		{
			System.out.println("Index out of bounds...!");
		}
	}

	public int getCaveId()
	{
		return this.caveId;
	}

	public int[] getCaveDirection()
	{
		return this.caveDirection;
	}

	public EvilCreature getEnemy()
	{
		return this.enemy;
	}

	public boolean getHasEnemy()
	{
		return this.hasEnemy;
	}

	public boolean getHasPotion()
	{
		return this.hasPotion;
	}

	public String getTonic()
	{
		return this.tonic;
	}

	public void setCaveId(int newCaveId)
	{
		Validation valid = new Validation();

		if(!valid.checkNegativeNumber(newCaveId))
			this.caveId = newCaveId;
		else
			this.caveId = 0;
	}

	public void setCaveDirection(int[] newCaveDirection)
	{
		if(newCaveDirection.length == 4)
			this.caveDirection = newCaveDirection;
		else
		{
			this.caveDirection = new int[4];

			for(int temp: this.caveDirection)
				temp = 0;
		}
	}

	public void setEnemy(EvilCreature newEnemy)
	{
		if(newEnemy instanceof EvilCreature)
			this.enemy = newEnemy;
		else
			this.enemy = null;
	}

	public void setHasEnemy(boolean newHasEnemy)
	{
		this.hasEnemy = newHasEnemy;
	}

	public void setHasPotion(boolean newHasPotion)
	{
		this.hasPotion = newHasPotion;
	}

	public void setTonic(String newTonic)
	{
		this.tonic = newTonic;
	}

	public String toString()
	{
		StringBuilder directionBuilder = new StringBuilder();
		for(int temp: this.caveDirection)
		{
			directionBuilder.append(temp).append(" ");
		}

		String formattedDirection = directionBuilder.toString().trim(); 

		String result = String.format("| %-4d | %-10s | %-13s | %-20s |",
								this.caveId, 
								formattedDirection, 
								this.hasEnemy ? this.enemy.getIdentity() 
								: "No enemy",
								this.hasPotion ? this.choosePotion(this.tonic)
								: "No Potion");

		return result;
	}
}