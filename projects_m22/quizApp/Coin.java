import java.util.Scanner;
class Coin
{
	public static void main(String[] args) 
	{
		// Math.random gives the random number in between 0.0000 to 0.99999...
		int randomNumber = (int)(Math.round(Math.random())*1);

		System.out.println("Choose Heads or Tails");
		Scanner sc = new Scanner(System.in);
		
		//Tt can take input and acting as a buffer while decision making
		sc.nextLine();
		sc.close();
		if(randomNumber==1)
			System.out.println("It's a Head");
		else
			System.out.println("It's a Tail");
	}
}