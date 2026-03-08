import java.util.ArrayList;

public class Validation
{
	public Validation()
	{

	}

	public boolean checkAlphabeticCharacterOrNot(char character)
	{
		if(character < 'a' || character > 'z')
			return false;
		return true;
	}

	public boolean checkAlphabeticStringOrNot(String newString)
	{
		for(int index = 0; index < newString.length(); index++)
		{
			if((newString.charAt(index) < 'a' || newString.charAt(index) > 'z')
				&& newString.charAt(index) != ' ' && newString.charAt(index) != ','
				&& newString.charAt(index) != '.' && newString.charAt(index) != '!')
				return false;
		}

		return true;
	}

	public boolean checkEmptyString(String newString)
	{
		if(newString.isEmpty())
			return true;
		return false;
	}

	public boolean checkDoubleStringOrNot(String newString)
	{
		for(int index = 0; index < newString.length(); index++)
		{
			if((newString.charAt(index) < '0' || newString.charAt(index) > '9')
			&& newString.charAt(index) != '.' 
			&& newString.charAt(index) != '-')
				return false;
		}

		return true;
	}

	public boolean checkIndexInRangeOrNot(String newString, int index)
	{
		if(index < 0 || index > newString.length())
			return false;
		return true;
	}

	public boolean checkLeaderAliveOrNot(ArrayList<Hero> herosParty)
	{
		for(Hero hero: herosParty)
		{
			if(hero.getIdentity() == "Pierre the Leader"
			&& !hero.getIsAlive())
			{
				return true;
			}
		}

		return false;
	}

	public boolean checkNegativeNumber(int number)
	{
		if(number < 0)
			return true;
		return false;
	}

	public boolean checkNumericStringOrNot(String newString)
	{
		for(int index = 0; index < newString.length(); index++)
		{
			if((newString.charAt(index) < '0' || newString.charAt(index) > '9')
			&& newString.charAt(index) != '-')
				return false;
		}

		return true;
	}

	public boolean checkStartAndEndWithWhiteSpace(String newString)
	{
		if(newString.length() != 0)
		{
			if(newString.charAt(0) == ' ' || newString.charAt(newString.length() - 1) == ' ')
				return true;	
		}
		return false;
	}
}