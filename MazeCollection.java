import java.util.ArrayList;

public class MazeCollection
{
	ArrayList<Maze> mazeCollection;

	public MazeCollection()
	{
		this.mazeCollection = new ArrayList<Maze>();
	}

	public MazeCollection(ArrayList<Maze> newMazeCollection)
	{
		setMazeCollection(newMazeCollection);
	}

	public void createMazeCollection(String fileName)
	{
		FileIO fileIO = new FileIO();

		try
		{
			this.mazeCollection = fileIO.readTheFile(fileName);
		}
		catch(Exception e)
		{
			System.out.println("Unable to create maze collection...!");
		}
	}

	public void display()
	{
		System.out.println("Information of Maze Collection: ");
		for(Maze temp: this.mazeCollection)
		{
			System.out.println(temp);
			System.out.println("----------------------------------------------------");
		}
	}

	public ArrayList<Maze> getMazeCollection()
	{
		return this.mazeCollection;
	}

	public int getMazeCollectionSize()
	{
		return this.mazeCollection.size();
	}

	public Maze getSpecificMaze(int mazeNumber)
	{
		for(Maze temp: this.mazeCollection)
		{
			if(temp.getMazeId() == mazeNumber)
				return temp;
		}

		return null;
	}

	public void setMazeCollection(ArrayList<Maze> newMazeCollection)
	{
		if(newMazeCollection instanceof ArrayList<Maze>)
			this.mazeCollection = newMazeCollection;
		else
			this.mazeCollection = null;
	}

	public void setSpecificMaze(Maze newMazeDetails, int mazeNumber)
	{
		boolean modificationSuccess = false;

		for(Maze temp: this.mazeCollection)
		{
			if(temp.getMazeId() == mazeNumber)
			{
				temp = newMazeDetails;
				modificationSuccess = true;
			}
		}

		if(!modificationSuccess)
		{
			System.out.println("The maze cannot be found in the collection...!");
		}
	}

	public String toString()
	{
		String result = "";
		
		for(Maze temp: this.mazeCollection)
		{
			result += "----------------------------------------------" 
					  + "----------------\n";
			result += temp + "\n";
		}

		return result;
	}
}