
public class TwoDArrayChallenges
	{

		public static void main(String[] args)
			{
				challengeOne();
				
			}
		public static void challengeOne()
		{
				int numbers [][]= new int [3][4];
				int firstNumber = 2;
				int add = firstNumber;
				
				for (int row=0; row<numbers.length;row++)
					{
						for (int col=0; col<numbers.length; col++)
							{
								numbers[row][col] = add;
								add += firstNumber;
							}
					}
			}

	}
