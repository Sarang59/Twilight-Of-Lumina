import java.util.ArrayList;

public class GameSetting
{
	public GameSetting()
	{

	}

	public void createHerosParty(ArrayList<Hero> herosParty)
	{
		Attack leaderAttack = new MagicAttack("Sword, Shield and Magic", "All", 
											225);
		Hero leader = new Leader(500, "Pierre the Leader", "M",
								"Sorry King, I have failed you miserably...!",
								"Phiphiphiphi", true,
								leaderAttack, 500, 0);
		herosParty.add(leader);

		Attack wizardAttack = new MagicAttack("Wand", "Magic", 125);
		Hero wizard = new Wizard(350, "Ferris the Wizard", "F",
								"You will witness my wrath of magic in" 
								+ " next duel...!", "Fhehehehe", true, 
								wizardAttack, 350, 0);
		herosParty.add(wizard);

		Attack brawlerAttack = new PhysicalAttack("Sheer Strength",	
												   "Physical", 75);
		Hero brawler = new Brawler(400, "Marnus the Brawler", "M",
								   "You will pay for this, I swear it...!",
								   "Mahihihihi", true, brawlerAttack, 400);
		herosParty.add(brawler);

		Attack crusaderAttack = new PhysicalAttack("Spear", "Physical", 60);
		Hero crusader = new Crusader(375, "Redis the Crusader", "M",
									"My spear will pierce your heart...!",
									"Rhehehehehe", true, crusaderAttack, 375);
		herosParty.add(crusader);

		Attack knighAttack = new PhysicalAttack("Sword and shield", 
											    "Physical", 50);
		Hero knight = new Knight(325, "Mandalin the Knight", "F",
								"Justice must prevail...!", "Khikhikhikhi",
								true, knighAttack, 325);
		herosParty.add(knight);

		Attack guideAttack = new SupportAttack("Speed and Intelligence", 
												"Support", 0);
		Hero guide = new Guide(300, "Domina the Guide", "F",
							   "Looks like my luck ran out...!",
							   "Domimimimi", true, guideAttack, 300);
		herosParty.add(guide);

		Attack rougeAttack = new PhysicalAttack("Blade and Speed", "Physical", 50);
		Hero rouge = new Rouge(350, "Barnney the Rouge", "M",
							   "Death will come in a blink of eye and" + 
							   " purge you...!", "Bahehehehehe", true,
							   rougeAttack, 350);
		herosParty.add(rouge);

		Attack clericAttack = new SupportAttack("Healing abilities, barrier" 
												+ " and speed", "Support", 0);
		Hero cleric = new Cleric(300, "Gia the Cleric", "F",
								"Sorry guys I can't protect you anymore...!",
								"Gihihihihi", true, clericAttack, 300, false,
								new ArrayList<String>());
		herosParty.add(cleric);
	}

	public MazeCollection getMazeCluster()
	{
		MazeCollection mazeCluster = new MazeCollection();
		mazeCluster.createMazeCollection("Mock_Mazes.txt");
		return mazeCluster;
	}
}