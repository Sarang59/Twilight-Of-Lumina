import java.util.*;

public class Maze
{
	private int mazeId;
	private String mazeName;
	private ArrayList<Cave> mazeDetails;

	public Maze()
	{
		mazeDetails = new ArrayList<Cave>();
	}

	public Maze(int newMazeId, String newMazeName, 
				ArrayList<Cave> newMazeDetails)
	{
		this.mazeDetails = newMazeDetails;
	}

	public int changeCave(char direction, int[] caveDirections,
						Wizard wizard)
	{
		int way = -1;

		if(direction == 'k')
		{
			for(int item: caveDirections)
			{
				if(item == 50)
					return 50;			
			}
		}
		else if(direction == 'd'
		&& wizard.getNumberOfKeys() == 1)
		{
			for(int item: caveDirections)
			{
				if(item == 100)
					return 100;
			}
		}
		else if(direction == 'd'
		&& wizard.getNumberOfKeys() == 0)
		{
			boolean destinationFlag = false;
			for(int item: caveDirections)
			{
				if(item == 100)
					destinationFlag = true;
			}

			if(!destinationFlag)
				return 0;

			System.out.println("-------------------------");
			System.out.println("Please retrieve the key to enter" 
							   + " the destination");
		}
		else
		{
			if(direction == 'n')
				way = 0;
			else if(direction == 'e')
				way = 1;
			else if(direction == 'w')
				way = 2;
			else if(direction == 's')
				way = 3;
		}

		if(way == -1)
			return 0;

		return caveDirections[way];
	}

	public void display()
	{
		System.out.println("Maze information is as follows: ");
		for(Cave temp: this.mazeDetails)
		{
			System.out.println(temp);
			System.out.println("----------------------------------------------------");
		}
	}

	public void drawCave(int[] caveDirections)
	{
		if(caveDirections[0] == 50)
			System.out.println("\t | K |");
		else if(caveDirections[0] == 100)
			System.out.println("\t | D |");
		else if(caveDirections[0] != 0)
			System.out.println("	 | N |");
		else
		{
			System.out.println("\t   _");
			System.out.println("\t |   |");
		}
		
		System.out.println("         |   |");
		System.out.println("         |   |");
		System.out.println("         |   |");
		System.out.println("         |   |");
		System.out.println("----------   ----------");
		
		if(caveDirections[1] == 0 && caveDirections[2] == 0)
			System.out.println("|                     |");
		else if(caveDirections[1] == 100 && caveDirections[2] == 0)
			System.out.println("|                     D");
		else if(caveDirections[1] == 0 && caveDirections[2] == 100)
			System.out.println("D                     |");
		else if(caveDirections[1] == 50 && caveDirections[2] == 0)
			System.out.println("|                     K");
		else if(caveDirections[1] == 0 && caveDirections[2] == 50)
			System.out.println("K                     |");
		else if(caveDirections[1] == 50 && caveDirections[2] == 100)
			System.out.println("D                     K");
		else if(caveDirections[1] == 100 && caveDirections[2] == 50)
			System.out.println("K                     D");
		else if(caveDirections[1] != 0 && caveDirections[2] == 50)
			System.out.println("K                     E");
		else if(caveDirections[1] == 50 && caveDirections[2] != 0)
			System.out.println("W                     K");
		else if(caveDirections[1] != 0 && caveDirections[2] == 100)
			System.out.println("D                     E");
		else if(caveDirections[1] == 100 && caveDirections[2] != 0)
			System.out.println("W                     D");
		else if(caveDirections[1] != 0 && caveDirections[2] == 0)
			System.out.println("|                     E");
		else if(caveDirections[1] == 0 && caveDirections[2] != 0)
			System.out.println("W                     |");
		else
			System.out.println("W                     E");
		
		System.out.println("----------   ----------");
		System.out.println("         |   |");
		System.out.println("         |   |");
		System.out.println("         |   |");
		System.out.println("         |   |");

		if(caveDirections[3] == 50)
			System.out.println("         | K |");
		if(caveDirections[3] == 100)
			System.out.println("         | D |");
		else if(caveDirections[3] != 0)
			System.out.println("         | S |");
		else
			System.out.println("         | _ |");
	}

	public ArrayList<Cave> getMazeDetails()
	{
		return this.mazeDetails;
	}

	public int getMazeId()
	{
		return this.mazeId;
	}

	public String getMazeName()
	{
		return this.mazeName;
	}

	public Cave getSpecificCave(int caveNumber)
	{
		for(Cave temp: this.mazeDetails)
		{
			if(temp.getCaveId() == caveNumber)
				return temp;
		}

		return null;
	}

	public void setMazeDetails(ArrayList<Cave> newMazeDetails)
	{
		this.mazeDetails = newMazeDetails;
	}

	public void setMazeId(int newMazeId)
	{
		this.mazeId = newMazeId;
	}

	public void setMazeName(String newMazeName)
	{
		this.mazeName = newMazeName;
	}

	public void setSpecificCave(Cave newCave, int caveNumber)
	{
		for(Cave temp: this.mazeDetails)
		{
			if(temp.getCaveId() == caveNumber)
			{
				temp = newCave;
			}
		}
	}

	public String toString()
	{
		String result = "";

		result += "| " + this.mazeId + " | ";
		result += this.mazeName + " | \n";
		result += "--------------------------------------------------" 
				  + "------------\n";
		
		for(Cave temp: this.mazeDetails)
		{
			result += temp;
			result += "\n--------------------------------------------" 
					  + "------------------\n";
		}

		return result;
	}
}