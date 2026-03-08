import java.lang.Math;

public class RandomNumberGenerator
{
	public RandomNumberGenerator()
	{

	}

	public int getRandomNumber(int minLimit, int maxLimit)
	{
		double randomDigit = Math.random();
		int difference = maxLimit - minLimit + 1;
		int number = (int)(randomDigit * difference) + minLimit;
		return number;
	}
}