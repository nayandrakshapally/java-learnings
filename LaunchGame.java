import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	int guessingNumber()
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Guesser! Kindly Guess the number");
	     guessNum=sc.nextInt();
	     return guessNum;
	}
}

class Player
{
	int numFromP;
	
	static int count;

	
	int guessingNumberFromP()
	{
		++count;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Player " + count+ " ! Kindly Guess the number");
	     numFromP=sc.nextInt();
	     return numFromP;
	}
}


class Umpire
{
	 int numFromGuesser;
	 int numFromPlayer1;
	 int numFromPlayer2;
	 int numFromPlayer3;

	void collectNumberFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessingNumber();
	}
	
	void collectNumberFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessingNumberFromP();
		numFromPlayer2=p2.guessingNumberFromP();
		numFromPlayer3=p3.guessingNumberFromP();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1 )
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All three players guessed correctly. Game Tied!");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println( "Player 1 and Player 2  guessed correctly. Game Tied!");
			}
			else if(numFromGuesser==numFromPlayer3 )
			{
				System.out.println( "Player 1 and Player 3  guessed correctly. Game Tied!");
			}
			else
			{
			System.out.println("Player1 won the game");
			}
			
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3 )
			{
				System.out.println("Player 2 and Player3  guessed correctly. Game Tied!");
			}
			else
			{
			System.out.println("Player2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 won the game");
		}
		else
		{
			System.out.println("Game Lost try again");
		}
	}
}
public class LaunchGame 
{

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();

	}

}
