package code;

import java.util.Scanner;

public class randomNumberGuessingGame {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 10;	
		int number = (int)(Math.random()*(max-min + 1) + min);

		Scanner input = new Scanner(System.in);
		int guess; 
		
		do 
		{
			guess = input.nextInt();
	
			if(guess == number)
			{
				if( (number == 1) || (number == 2) )
				{				
					int cheatNumber = (int)(Math.random()*(max-min + 1) + min);	
					if(guess == cheatNumber)
					{
						System.out.println("Correct");
						guess = number;
					}
					else
					{
						System.out.println("Incorrect");
						guess = 0;
					}
				}
				else 
					System.out.println("Correct");
			}
			else 
				System.out.println("Incorrect");			
		}while(guess != number);
		
	}

}
 