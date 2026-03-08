import java.util.Scanner;

public class Input
{
	public Input()
	{

	}

	public char getCharacterInput(String message, int index)
	{
		Validation valid = new Validation();

		String input = this.getUserInput(message);

		if(!valid.checkAlphabeticStringOrNot(input.toLowerCase())
		|| valid.checkEmptyString(input)
		|| valid.checkStartAndEndWithWhiteSpace(input)
		|| !valid.checkIndexInRangeOrNot(input, index))
		{
			if(valid.checkEmptyString(input))
			{
				System.out.println("The entered value is Empty...!");
			}
			else if(valid.checkStartAndEndWithWhiteSpace(input))
			{
				System.out.println("The entered value cannot start and end with whitespace...!");
			}
			else if(!valid.checkAlphabeticStringOrNot(input))
			{
				System.out.println("Please enter alphabets only...!");
			}
			else if(!valid.checkIndexInRangeOrNot(input, index))
			{
				System.out.println("Index is out of bounds...!");
			}
			
			return '0';
		}

		char characterInput = input.toLowerCase().trim().charAt(index);
		
		return characterInput;
	}

	public double getDoubleInput(String message)
	{
		Validation valid = new Validation();
		
		String input = this.getUserInput(message);

		if(!valid.checkDoubleStringOrNot(input)
		|| valid.checkEmptyString(input)
		|| valid.checkStartAndEndWithWhiteSpace(input))
		{
			if(valid.checkEmptyString(input))
			{
				System.out.println("The entered value is empty...!");
			}
			else if(valid.checkStartAndEndWithWhiteSpace(input))
			{
				System.out.println("The entered value cannot start and end with whitespaces...!");
			}
			else if(!valid.checkDoubleStringOrNot(input))
			{
				System.out.println("The entered value is not in decimal number format...!");
				System.out.println("Please enter numbers only with a dot...!");
			}

			return -1.0;
		}

		double doubleInput = Double.parseDouble(input);
		
		return doubleInput;
	}

	public int getIntegerInput(String message)
	{
		Validation valid = new Validation();

		String input = this.getUserInput(message);

		if(!valid.checkNumericStringOrNot(input)
		|| valid.checkEmptyString(input)
		|| valid.checkStartAndEndWithWhiteSpace(input))
		{
			if(valid.checkEmptyString(input))
			{
				System.out.println("The entered value is empty...!");
			}
			else if(valid.checkStartAndEndWithWhiteSpace(input))
			{
				System.out.println("The entered value cannot start and end with whitespaces...!");
			}
			else if(!valid.checkNumericStringOrNot(input))
			{
				System.out.println("Please enter numbers only...!");
			}

			return -1;
		}

		int integerInput = Integer.parseInt(input);

		return integerInput;
	}

	public String getStringInput(String message)
	{
		Validation valid = new Validation();

		String stringInput = this.getUserInput(message);

		if(!valid.checkAlphabeticStringOrNot(stringInput.toLowerCase())
		|| valid.checkEmptyString(stringInput)
		|| valid.checkStartAndEndWithWhiteSpace(stringInput))
		{
			if(valid.checkEmptyString(stringInput))
			{
				System.out.println("The string is Empty...!");
			}
			else if(valid.checkStartAndEndWithWhiteSpace(stringInput))
			{
				System.out.println("The string cannot start and end with whitespace...!");
			}
			else if(!valid.checkAlphabeticStringOrNot(stringInput.toLowerCase()))
			{
				System.out.println("Please enter alphabets only...!");
			}

			return null;
		}

		return stringInput;
	}

	public String getUserInput(String message)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(message);
		String input = scanner.nextLine();

		return input;
	}
}