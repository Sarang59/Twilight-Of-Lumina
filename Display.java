import java.util.ArrayList;

public class Display
{
    public Display()
    {

    }

	public void displayEvilCreature(EvilCreature enemy)
	{
		System.out.println("-------------------------");
		System.out.println("Encountered: " + enemy.getIdentity());
		System.out.println("-------------------------");
	}

	public void displayInstructions()
	{
		System.out.println("-------------------------------------------" 
							+ "---------------");
		System.out.println("------------ WELCOME TO TWILIGHT OF LUMINA ----" 
							+ "-----------");
		System.out.println("------------------------------------------------" 
							+ "----------");
		System.out.println("---------------------- INSTRUCTIONS " 
							+ "----------------------");
		System.out.println("------------------------------------------------" 
							+ "----------");
		System.out.println("Twilight of Lumina is a game in which there are");
		System.out.println("two types of forces: light and dark ones." 
							+ " The balance");
		System.out.println("between their powers is maintained through 5" 
							+ " crystals");
		System.out.println("called Luminas. However, an evil force of the" 
							+ " shadow");
		System.out.println("king named Valos and his Generals invaded the" 
							+ " realm");
		System.out.println("of Noctirion, captured the crystals, and hid" 
							+ "them in");
		System.out.println("different places. Now it's the responsibility of");
		System.out.println("the main protagonist (Prince of the realm)" 
							+ " and his");
		System.out.println("allies to find those crystals and bring them" 
							+ " together");
		System.out.println("to restore peace in Noctirion. The Prince must" 
							+ " visit");
		System.out.println("different places to find the keys to unlock" 
							+ " treasure");
		System.out.println("chests and retrieve the missing crystals.");
		System.out.println("------------------------------------------------" 
							+ "----------");
		System.out.println("Allies of the Prince:");
		System.out.println("------------------------------------------------"
							+ "----------");
		System.out.println("1. Ferris the Wizard");
		System.out.println("2. Marnus the Brawler");
		System.out.println("3. Redis the Crusader");
		System.out.println("4. Mandalin the Knight");
		System.out.println("5. Domina the Guide");
		System.out.println("6. Barnney the Rogue");
		System.out.println("7. Gia the Cleric");
		System.out.println("------------------------------------------------" 
							+ "----------");
		System.out.println("There are various mazes through which the" 
							+ " Prince's");
		System.out.println("party must travel. Defeat the commanders of the");
		System.out.println("Shadow King to obtain keys. Then, defeat a" 
							+ " General");
		System.out.println("of the Shadow King and proceed to the next maze.");
		System.out.println("Each maze will have around 10 to 12 rooms/caves," 
							+ " but");
		System.out.println("the last maze will have 20 rooms/caves." 
							+ " Beware of");
		System.out.println("the monsters lingering in the caves, rooms," 
							+ " or locality.");
		System.out.println("------------------------------------------------"
							+ "----------");
		System.out.println("WARNING: IF THE PRINCE DIES, THEN THE GAME" 
							+ " IS OVER!");
		System.out.println("------------------------------------------------" 
							+ "----------");
		System.out.println("GOOD LUCK...!");
	}

	public void displayInventoryList(ArrayList<Hero> herosParty)
	{
		Cleric cleric = new Cleric();
		Wizard wizard = new Wizard();
		Leader leader = new Leader();

		for(Hero hero: herosParty)
		{
			if(hero.getIdentity() == "Gia the Cleric")
			{
				cleric = (Cleric)hero;
			}
			else if(hero.getIdentity() == "Pierre the Leader")
			{
				leader = (Leader)hero;
			}
			else if(hero.getIdentity() == "Ferris the Wizard")
			{
				wizard = (Wizard)hero;
			}
		}

		int index = 1;

		System.out.println("\n-----------------------------------" + 
						  "-------------");

		if(!cleric.getPotionName().isEmpty())
		{
			for(String item: cleric.getPotionName())
			{
				System.out.println(index + ". " + item);
				index += 1;
			}
		}
		else
		{
			System.out.println("No Potions available");
		}
		
		System.out.println("-----------------------------------" + 
						  "-------------");

		if(leader.getNumberOfCrystal() == 0)
		{
			System.out.println("No Crystals available");
		}
		else
		{
			System.out.println("Leader has " + leader.getNumberOfCrystal() 
								+ " Crystals");
		}

		System.out.println("-----------------------------------" + 
						  "-------------");
		if(wizard.getNumberOfKeys() == 0)
		{
			System.out.println("No Keys available");
		}
		else
		{
			System.out.println("Wizard has " + wizard.getNumberOfKeys() 
								+ " Key");
		}
		System.out.println("-----------------------------------" + 
						  "-------------");
	}

	public void displayMazeInformation(Maze maze)
	{
		System.out.println("------------------------------------------------"
						  + "----------------------");
		System.out.println("-------------------- MAZE - " + maze.getMazeId() +
							" - " + maze.getMazeName() 
							+ " --------------------");
		System.out.println("------------------------------------------------"
						  + "----------------------");
	
		for(Cave cave: maze.getMazeDetails())
		{
			boolean hasKey = false;
			boolean hasCrystal = false;
			String items = "";

			if(cave.getHasEnemy())
			{
				for(String item: cave.getEnemy().getItemName())
				{
					if(item == "Key")
					{
						hasKey = true;	
					}
					else if(item == "Crystal")
					{
						hasCrystal = true;
					}
				}
			}

			if(hasKey)
			{
				items += "Key ";
			}
			if(hasCrystal)
			{
				items += "Crystal, ";
			}
			if(cave.getHasPotion())
			{
				items += cave.choosePotion(cave.getTonic());
			}

			String enemyStatus = "Not Available";
			if(cave.getHasEnemy())
			{
				if(cave.getEnemy().getIsAlive())
				{
					enemyStatus = "Alive";
				}
				else 
				{
					enemyStatus = "Dead";
				}
			}

			String result = String.format("| %-4d | %-15s | %-15s | %-23s |",
								cave.getCaveId(), 
								cave.getHasEnemy() ? cave.getEnemy().getIdentity() 
								: "No enemy",
								enemyStatus,
								items.isEmpty() ? "No items" : items);
			System.out.println(result);
			System.out.println("------------------------------------------------"
						  	  + "----------------------");
		}
	}

	public void displayMenu()
	{
		String[] menu = {"Instructions", "Start the game"};
		int count = 1;

		System.out.println("--------------------");
		System.out.println("--------MENU--------");
		for(String item: menu)
		{
			System.out.println(count + ". " + item);
			count += 1;
		}
	}

    public void displayPrincesParty(ArrayList<Hero> herosParty)
    {
        System.out.println("--------------------------------------------------"
							+ "-------------------------------------------" 
							+ "---------------------------");
		System.out.println("----------- PRINCE'S PARTY -----------");
		System.out.println("---------------------------------------------------" 
							+ "------------------------------------------" 
							+ "---------------------------");
		
		String title = String.format("| %-4s | %-20s | %-2s | %-39s" 
									+ "| %-10s | %-4s | %-6s | %-10s |",
							"HP", "Member of Party", "Gr", "Weapons",
									"Type", "AP", "Status", "Items");
		System.out.println(title);
		System.out.println("---------------------------------------------------" 
							+ "------------------------------------------" 
							+ "---------------------------");
		
		for(int i = 0; i < herosParty.size(); i++)
			System.out.println(herosParty.get(i));
		System.out.println("-------------------------------------------------"
							+ "------------------------------------------" 
							+ "-----------------------------");
    }

	public void displayStageInformation(int mazeId, String mazeName)
	{
		System.out.println("\n---------- WELCOME TO MAZE " + mazeId + " - " 
							+ mazeName + " ----------");
	}
}