import java.io.*;
import java.util.*;

public class FileIO
{
	private static String outputFileName = "Result.txt";

	public FileIO()
	{

	}

	public ArrayList<Maze> readTheFile(String fileName) throws IOException
	{
		int mazeId = 0;
		String mazeName = "";
		ArrayList<Cave> webDetails = new ArrayList<Cave>();
		ArrayList<Maze> mazeCluster = new ArrayList<Maze>();

		if(!fileName.isEmpty())
		{
			FileReader reader = new FileReader(fileName);
			Scanner fileInput = new Scanner(reader);

			Maze newMaze = new Maze();
			
			while(fileInput.hasNext())
			{
				String line = fileInput.next();

				String[] data = line.split(",");
				
				if(data.length >= 5)
				{
					Cave newCave = new Cave();
					newCave.createCave(data, mazeId);
					webDetails.add(newCave);
				}
				else if(data.length == 3)
				{
					mazeId = Integer.parseInt(data[0]);
					for(int index = 1; index < data.length; index++)
						mazeName += data[index].trim() + " ";
				}
				else if(line.equals("---------------"))
				{
					newMaze.setMazeId(mazeId);
					newMaze.setMazeName(mazeName);
					newMaze.setMazeDetails(webDetails);
					mazeCluster.add(newMaze);
					mazeName = "";
					webDetails = new ArrayList<Cave>();
					newMaze = new Maze();
				}
				else
					continue;
			}

			try
			{
				reader.close();
			}
			catch(Exception e)
			{
				System.out.println("Cannot close the file...!");
			}
		}
		else
		{
			System.out.println("File Name is empty...! Cannot read the file...!");
		}

		return mazeCluster;
	}

	public void writeToFile(String data) throws IOException
	{
		FileWriter writer = new FileWriter(outputFileName);
		writer.write(data);
		writer.close();
	}
}