
public class MatrixChallenges
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				
			}
		public static void challengeOne()
		{
				int numbers [][]= new int [3][4];
				numbers [0][0] = 2;
				numbers [0][1] = 4;
				numbers [0][2] = 6;
				numbers [0][3] = 8;
				numbers [1][0] = 3;
				numbers [1][1] = 6;
				numbers [1][2] = 9;
				numbers [1][3] = 12;
				numbers [2][0] = 4;
				numbers [2][1] = 8;
				numbers [2][2] = 12;
				numbers [2][3] = 16;
				
				System.out.println(numbers [1][2]);
					
			}
		public static void challengeTwo()
		{
			String mustang [][] = new String [5][3];

			for (int row = 0; row < mustang.length; row++)
				{
					for (int col = 0; col < mustang[row].length; col++)
						{
							mustang [row][col] = "Mustang";
							System.out.print(mustang [row][col] + " ");
						}
					System.out.println(" ");
				}
			
			
		}
		
		public static void challengeThree()
		{
			int firstNumber = 1;
			int sum = 0;
			int numbers [][] = new int [3][3];
			for (int row = 0; row < numbers.length; row++)
				{
					for (int col = 0; col < numbers [row].length; col++)
						{
							numbers [row][col] =  firstNumber;
							firstNumber += 1;
							System.out.print(numbers[row][col] + " ");
						}
					System.out.println(" ");
				}
			sum = numbers[0][0] + numbers [0][2] + numbers [2][0] + numbers [2][2];
			System.out.println(sum);
		}

	}
