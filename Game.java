import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Game
{
	public Game()
	{

	}

	public String chooseEnemyToFight(Hero hero, EvilCreature enemy, 
									 Attack attack, String enemyIdentity)
	{
		switch(enemyIdentity)
		{
			case "Barnney the Rouge":
				return enemy.fightRouge(attack);
			/*case "Blazing Dragon":
				return hero.fightBlazingDragon(attack);*/
			case "Domina the Guide":
				return enemy.fightGuide(attack);
			case "Elder Treant":
				return hero.fightElderTreant(attack);
			case "Ferris the Wizard":
				return enemy.fightWizard(attack);
			/*case "Fiery Scamp":
				return hero.fightFieryScamp(attack);
			case "Fire Serpant":
				return hero.fightFireSerpant(attack);*/
			case "Gia the Cleric":
				return enemy.fightCleric(attack);
			case "Goblin":
				return hero.fightGoblin(attack);
			/*case "Infernal Efreet":
				return hero.fightInfernalEfreet(attack);
			case "Lava Imp":
				return hero.fightLavaImp(attack);
*/			case "Mandalin the Knight":
				return enemy.fightKnight(attack);
			case "Marnus the Brawler":
				return enemy.fightBrawler(attack);
			case "Orc":
				return hero.fightOrc(attack);
			case "Pierre the Leader":
				return enemy.fightLeader(attack);
			/*case "Phoenix":
				return hero.fightPhoenix(attack);*/
			case "Redis the Crusader":
				return enemy.fightCrusader(attack);
			case "Troll":
				return hero.fightTroll(attack);
			case "Vine Wraith":
				return hero.fightVineWraith(attack);
			case "Wood Golem":
				return hero.fightWoodGolem(attack);
			default:
				System.out.println("Invalid Enemy Identity....!");
		}

		return null;
	}

	private void donateItem(ArrayList<Hero> heroesParty, EvilCreature enemy)
	{
		RandomNumberGenerator rng = new RandomNumberGenerator();
		String grantItem = "";

		switch(enemy.getIdentity())
		{
			case "Troll":
				grantItem = enemy.getItemName().get(0);
				
				for(Hero hero: heroesParty)
				{
					if(hero.getIdentity().equals("Gia the Cleric"))
					{
						Cleric currentMember = (Cleric)hero;
						ArrayList<String> newPotionName = 
											currentMember.getPotionName();
						newPotionName.add(grantItem);
						currentMember.setPotionName(newPotionName);
						hero = currentMember;
						System.out.println("FOUND " + grantItem.toUpperCase());
					}
				}
				break;
			case "Vine Wraith":
				grantItem = enemy.getItemName().get(0);
				
				for(Hero hero: heroesParty)
				{
					if(hero.getIdentity().equals("Gia the Cleric"))
					{
						Cleric currentMember = (Cleric)hero;
						ArrayList<String> newPotionName = 
											currentMember.getPotionName();
						newPotionName.add(grantItem);
						currentMember.setPotionName(newPotionName);
						hero = currentMember;
						System.out.println("FOUND " + grantItem.toUpperCase());
					}
				}
				break;
			case "Wood Golem":
				grantItem = enemy.getItemName().get(0);

				for(Hero hero: heroesParty)
				{
					if(hero.getIdentity().equals("Ferris the Wizard"))
					{
						Wizard currentMember = (Wizard)hero;
						currentMember.setNumberOfKeys(
							currentMember.getNumberOfKeys() + 1);
						hero = currentMember;
						System.out.println("FOUND A KEY");
					}
				}
				break;
			case "Elder Treant":
				for(Hero hero: heroesParty)
				{
					if(hero.getIdentity().equals("Pierre the Leader"))
					{
						Leader currentMember = (Leader)hero;
						currentMember.setNumberOfCrystal(
							currentMember.getNumberOfCrystal() + 1);
						hero = currentMember;
						System.out.println("FOUND A CRYSTAL");
					}
					else if(hero.getIdentity().equals("Gia the Cleric"))
					{
						grantItem = enemy.getItemName().get(1);
						Cleric currentMember = (Cleric)hero;
						ArrayList<String> newPotionName = 
											currentMember.getPotionName();
						newPotionName.add(grantItem);
						currentMember.setPotionName(newPotionName);
						hero = currentMember;
						System.out.println("FOUND " + grantItem.toUpperCase());
					}
				}
				break;
			default:
				System.out.println("Invalid Enemy Identity");
		}
	}

	public String fightOpponent(Hero hero, EvilCreature enemy, Input input)
	{
		String winner = "";
		Attack heroCurrentAttack = hero.getWeapons();
		Attack monsterCurrentAttack = enemy.getWeapons();

		if(hero.getHealthPoints() > enemy.getHealthPoints())
		{
			if(hero.getIdentity().equals("Pierre the Leader"))
			{
				System.out.println("1. Sword and Shield");
				System.out.println("2. Magic");
				int choice = input.getIntegerInput("Please choose " 
													+ "the attack: ");
				
				if(choice == 1)	
				{
					hero.setWeapons(new PhysicalAttack("Sword and shield",
														"Physical", 50));
				}	
				else
				{
					hero.setWeapons(new MagicAttack("Magic",
													"Magic", 100));
				}

				heroCurrentAttack = hero.getWeapons();
				winner = this.chooseEnemyToFight(hero, enemy, 
												 heroCurrentAttack, 
												 enemy.getIdentity());	
			
			}
			else
			{
				winner = this.chooseEnemyToFight(hero, enemy, 
												 heroCurrentAttack,
												 enemy.getIdentity());
			}
		}
		else
		{
			winner = this.chooseEnemyToFight(hero, enemy, monsterCurrentAttack,
											 hero.getIdentity());
		}

		return winner;
	}

	public int getUserChoice(Display display, Input input)
	{
		while(true)
		{
			display.displayMenu();
			int option = input.getIntegerInput("Please enter your choice: ");
			
			switch(option)
			{
				case 1:
					display.displayInstructions();
					break;
				case 2:
					return option;
				default:
					System.out.println("Invalid Choice");
					System.out.println("---------------");
			}
		}
	}

	public int moveToNextCave(Maze maze, Cave currentCave, Input input, 
							  ArrayList<Hero> heroesParty)
	{
		Wizard wizard = new Wizard();
		for(Hero hero: heroesParty)
		{
			if(hero.getIdentity() == "Ferris the Wizard")
			{
				wizard = (Wizard)hero;
				break;
			}
		}

		maze.drawCave(currentCave.getCaveDirection());

		char inputDirection = input.getCharacterInput("\nPlease" 
							+ " enter in which direction you" 
							+ " want to proceed : ", 0);
		
		int nextCaveId = maze.changeCave(inputDirection, 
								currentCave.getCaveDirection(), wizard);
		while(nextCaveId == 0)
		{
			inputDirection = input.getCharacterInput("\nPlease" 
							+ " re-enter in which direction you"
							+ " want to proceed : ", 0);
		
			nextCaveId = maze.changeCave(inputDirection, 
								currentCave.getCaveDirection(), wizard);
		}

		return nextCaveId;
	}

	public void playGame()
	{
		GameSetting setting = new GameSetting();
		Display display = new Display();
		Input input = new Input();
		Validation valid = new Validation();
		ArrayList<Hero> herosParty = new ArrayList<Hero>();

		setting.createHerosParty(herosParty);

		MazeCollection mazeCluster = setting.getMazeCluster();

		this.startGame(display, input, valid, mazeCluster, herosParty);
	}

	private void startGame(Display display, Input input,
						   Validation valid,
						   MazeCollection mazeCluster,
						   ArrayList<Hero> herosParty)
	{
		int decision = this.getUserChoice(display, input);

		int mazeId = 1;
		boolean gameEnded = false;
		String winner = "";

		if(decision == 2)
		{
			display.displayPrincesParty(herosParty);

			while(!gameEnded)
			{
				Maze maze = new Maze();
				
				gameEnded = valid.checkLeaderAliveOrNot(herosParty);

				for(Hero hero: herosParty)
				{
					if(hero.getIdentity() == "Ferris the Wizard")
					{
						Wizard wizard = (Wizard)hero;
						wizard.setNumberOfKeys(0);
					}
				}

				if(mazeId > 0 && mazeId < 6)
					maze = mazeCluster.getSpecificMaze(mazeId);
				else
					gameEnded = true;

				int locationId = 1;
				
				display.displayStageInformation(maze.getMazeId(), 
												maze.getMazeName());
				
				while(locationId > 0 && locationId < 101)
				{
					gameEnded = valid.checkLeaderAliveOrNot(herosParty);
					
					Cave currentCave = maze.getSpecificCave(locationId);

					if(currentCave.getHasEnemy() 
					&& currentCave.getEnemy().getIsAlive())
					{
						display.displayEvilCreature(currentCave.getEnemy());

						int count = 1;
						System.out.println("WHO WILL FIGHT....?");
						System.out.println("-------------------------");
						
						for(Hero hero: herosParty)
						{
							String update = "";
							switch(hero.getIdentity())
							{
								case "Pierre the Leader":
									Leader leader = (Leader)hero;
									update = String.format("%-4s |" 
													+ " %-20s | %-10s |",
											hero.getHealthPoints(),
											hero.getIdentity(),
											leader.getNumberOfCrystal() 
											+ " Crystals");
									break;
								case "Ferris the Wizard":
									Wizard wizard = (Wizard)hero;
									update = String.format("%-4s |" 
														+ " %-20s | %-10s |",
											hero.getHealthPoints(),
											hero.getIdentity(),
											wizard.getNumberOfKeys()
											+ " Keys");
									break;
								case "Gia the Cleric":
									Cleric cleric = (Cleric)hero;
									update = String.format("%-4s |" 
														+ " %-20s | %-10s |",
											hero.getHealthPoints(),
											hero.getIdentity(),
											cleric.getPotionName().size()
											+ " Potions");
									break;
								default:
									update = String.format("%-4s | %-20s | %-10s |",
											hero.getHealthPoints(),
											hero.getIdentity(),
											" ");
									break;
							}

							System.out.println(count + ". " 
											  + update);
							count += 1;
						}
						System.out.println("-------------------------");

						int option = input.getIntegerInput("Please choose the "
														+ "member to fight: ");
						
						while(option == -1)
						{
							option = input.getIntegerInput("Please choose the "
														+ "member to fight: ");
						}

						EvilCreature opponent = currentCave.getEnemy();
						Hero memberToFight = herosParty.get(option - 1);

						while(opponent.getIsAlive()
						&& memberToFight.getIsAlive())
						{
							winner = this.fightOpponent(memberToFight, 
														opponent,
														input);
							
							System.out.println("------------------------------"
											+ "----------");
							System.out.println("Winner of the fight is : "
												+ winner);
							System.out.println("------------------------------"
											+ "----------");
							this.updateHealthPoints(winner, memberToFight,
													opponent, herosParty);
							
							String choice = input.getUserInput("Please press" 
													+ "  enter to continue: ");
							while(!valid.checkEmptyString(choice))
							{
								choice = input.getUserInput("Please press enter to " 
															+ "continue: ");
							}
						}
						
						if(locationId == 100 
						&& !currentCave.getEnemy().getIsAlive())
						{
							Wizard wizard = new Wizard();

							for(Hero hero: herosParty)
							{
								if(hero.getIdentity() == "Ferris the Wizard")
								{
									wizard = (Wizard)hero;
								}
							}

							if(wizard.getNumberOfKeys() == 1)
							{
								mazeId += 1;
								System.out.println("------------------------------"
												+ "----------");
								break;
							}
						}
					}
					else
					{
						System.out.println("1. Check Maze Information");
						System.out.println("2. Use any potion which is acquired");
						System.out.println("3. Check Inventory list");
						System.out.println("4. Move to next cave");
						int choice = input.getIntegerInput("Please enter your choice: ");

						while(choice == -1)
						{
							choice = input.getIntegerInput("Please enter your choice: ");
						}

						switch(choice)
						{
							case 1:
								display.displayMazeInformation(maze);
								break;
							case 2:
								break;
							case 3:
								display.displayInventoryList(herosParty);
								break;
							case 4:
								break;
							default:
								System.out.println("Invalid choice");
								break;
						}
					}

					int nextCaveId = this.moveToNextCave(maze, currentCave, 
														input, herosParty);

					System.out.println("--------------------");
					System.out.println("Moving from cave " + locationId + 
									   " to cave " + nextCaveId);
					System.out.println("--------------------");
					
					locationId = nextCaveId;

					String choice = input.getUserInput("Please press enter to " 
													+ "continue or quit to" 
													+ " exit the game : ");
					while(!valid.checkEmptyString(choice)
						  && !choice.toUpperCase().equals("QUIT"))
					{
						choice = input.getUserInput("Please press enter to " 
													+ "continue or quit to"
													+ " exit the game: ");
					}
					System.out.println("------------------------------"
											+ "----------");
							

					if(choice.toUpperCase().equals("QUIT"))
						gameEnded = true;
				}
			}
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}

	public void updateHealthPoints(String winner, Hero member, 
								   EvilCreature enemy,
								   ArrayList<Hero> heroesParty)
	{
		if(winner.equals(member.getIdentity().split(" ")[2]))
		{
			if((enemy.getHealthPoints() - 
			   member.getWeapons().getAttackPoints()) <= 0)
			{
				enemy.setHealthPoints(0);
				enemy.setIsAlive(false);
				System.out.println(member.getIdentity() + " laughed: " 
									+ member.getLaugh());
				System.out.println(enemy.getIdentity() + " cried: " 
									+ enemy.getCry());
				System.out.println(enemy.getIdentity() + " is Dead...!");
				System.out.println("------------------------------");
				
				if(enemy.getHasItem())
				{
					this.donateItem(heroesParty, enemy);
				}
			}
			else
			{
				enemy.setHealthPoints(enemy.getHealthPoints() -
				member.getWeapons().getAttackPoints());
			}
		}
		else
		{
			if(member.getHealthPoints() <= 0)
			{
				member.setHealthPoints(0);
				member.setIsAlive(false);

				System.out.println(enemy.getIdentity() + " laughed: " 
									+ enemy.getLaugh());
				System.out.println(member.getIdentity() + " cried: " 
									+ member.getCry());
				System.out.println(member.getIdentity() + " is Dead...!");
				System.out.println("------------------------------");
			}
			else
			{
				member.setHealthPoints(member.getHealthPoints() -
				enemy.getWeapons().getAttackPoints());
			}
		}	
	}

	public void UsePotions(ArrayList<Hero> herosParty, 
						   ArrayList<Cave> mazeDetails,
						   Display display,
						   Input input, int currentCave,
						   boolean doubleAttackPotionInjected)
	{
		Cleric cleric = new Cleric();

		for(Hero hero: herosParty)
		{
			if(hero.getIdentity() == "Gia the Cleric")
			{
				cleric = (Cleric)hero;
			}
		}

		ArrayList<String> potionNames = cleric.getPotionName();
		Iterator<String> iterator = potionNames.iterator();
		
		int index = 1;
		for(String potion: potionNames)
		{
			System.out.println(index + ". " + potion);
			index += 1;
		}
		int choice = input.getIntegerInput("Please enter your choice");

		while(choice == -1 || choice > potionNames.size())
		{
			choice = input.getIntegerInput("Please re-enter your choice");
		}

		String chosenPotion = potionNames.get(index);
		switch(chosenPotion)
		{
			case "Healing Potion":
				System.out.println("-------------------------------------");
				System.out.println("Whom do you want to heal...?");
				System.out.println("-------------------------------------");

				for(int i = 0; i < herosParty.size(); i++)
				{
					System.out.println((i + 1) + ". " 
										+ herosParty.get(i).getIdentity());
				}
				int decision = input.getIntegerInput(
											"Please enter your choice");

				while(choice == -1 || choice > herosParty.size())
				{
					choice = input.getIntegerInput(
										"Please re-enter your choice");
				}

				Hero chosenHero = herosParty.get(decision);

				if(chosenHero.getHealthPoints() == chosenHero.getMaxHealthPoints())
				{
					System.out.println("No need of healing...!");
				}
				else
				{
					chosenHero.setHealthPoints(chosenHero.getMaxHealthPoints());

					while (iterator.hasNext()) 
					{
						if(iterator.next().equals("Healing Potion"))
						{
							iterator.remove();
							break;
						}
					}
				}

				break;
			case "Invisible Potion":
				
				break;
			case "Double Attack Potion":
				System.out.println("-------------------------------------");
				System.out.println("Whom do you want to make powerful...!");
				System.out.println("-------------------------------------");

				for(int i = 0; i < herosParty.size(); i++)
				{
					System.out.println((i + 1) + ". " 
										+ herosParty.get(i).getIdentity());
				}
				int option = input.getIntegerInput("Please enter your choice");

				while(choice == -1 || choice > herosParty.size())
				{
					choice = input.getIntegerInput(
										"Please re-enter your choice");
				}

				Hero hero = herosParty.get(option);

				if(hero.getIsAlive())
				{
					hero.getWeapons().setAttackPoints(
									hero.getWeapons().getAttackPoints() * 2);

					doubleAttackPotionInjected = true;
					
					while (iterator.hasNext()) 
					{
						if(iterator.next().equals("Double Attack Potion"))
						{
							iterator.remove();
							break;
						}
					}

					doubleAttackPotionInjected = true;
				}
				else
				{
					System.out.println("The hero is dead...!");
					doubleAttackPotionInjected = false;
				}
				
				break;
			case "Teleport Potion":
				System.out.println("Heros Party is currently in " 
										+ currentCave + " cave...!");
				int answer = input.getIntegerInput("Please enter cave " 
								+ " number in which you want to proceed...!");
				
				while(answer == -1 || answer > mazeDetails.get(-3).getCaveId()
					|| answer == 50 || answer == 100)
				{
					answer = input.getIntegerInput("Please re-enter cave "
								+ " number in which you want to proceed...!");
				}

				if(answer == currentCave)
				{
					System.out.println("No Change in Cave...!");
				}
				else
				{
					currentCave = answer;

					while (iterator.hasNext()) 
					{
						if(iterator.next().equals("Teleport Potion"))
						{
							iterator.remove();
							break;
						}
					}
				}

				break;
			case "Revive Potion":
				System.out.println("-------------------------------------");
				System.out.println("Whom do you want to revive...?");
				System.out.println("-------------------------------------");

				for(int i = 0; i < herosParty.size(); i++)
				{
					System.out.println((i + 1) + ". " 
										+ herosParty.get(i).getIdentity());
				}
				int possibility = input.getIntegerInput(
											"Please enter your choice");

				while(possibility == -1 || possibility > herosParty.size()
				|| possibility == 1)
				{
					possibility = input.getIntegerInput(
											"Please re-enter your choice");
				}

				Hero revivalHero = herosParty.get(possibility);

				if(revivalHero.getIsAlive() == false)
				{
					revivalHero.setIsAlive(true);

					while (iterator.hasNext()) 
					{
						if(iterator.next().equals("Revive Potion"))
						{
							iterator.remove();
							break;
						}
					}
				}
				else
				{
					System.out.println("The hero is already alive...!");
				}

				break;
			case "Love Potion":
				break;
			default:
				System.out.println("Invalid Potion name");
				break;
		}
	}
}

