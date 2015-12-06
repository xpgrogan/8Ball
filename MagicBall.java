import java.util.*;

public class MagicBall 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, ask me anything!");
		String ans = scan.nextLine();
		System.out.println("Your question: " + ans);
		System.out.println("My answer!");
		
		int ball = rand.nextInt(20);
		String msg = null;
		
		switch(ball)
		{
			case 0 : msg = "It is certain";
			break;
			case 1 : msg = "It is decidedly so";
			break;
			case 2 : msg = "Without a doubt";
			break;
			case 3 : msg = "Yes, definitely";
			break;
			case 4 : msg = "You may rely on it";
			break;
			case 5 : msg = "As I see it, yes";
			break;
			case 6 : msg = "Most likely";
			break;
			case 7 : msg = "Outlook good";
			break;
			case 8 : msg = "Yes";
			break;
			case 9 : msg = "Signs point to yes";
			break;
			case 10 : msg = "Reply hazy try again";
			break;
			case 11 : msg = "Ask again later";
			break;
			case 12 : msg = "Better not tell you now";
			break;
			case 13 : msg = "Cannot predict now";
			break;
			case 14 : msg = "Concentrate and ask again";
			break;
			case 15 : msg = "Don't count on it";
			break;
			case 16 : msg = "My reply is no";
			break;
			case 17 : msg = "My sources say no";
			break;
			case 18 : msg = "Outlook not so good";
			break;
			case 19 : msg = "Very doubtful";
			break;
			default : msg = "What the hellllll???";
			break;
		}
		
		System.out.println(msg);
	}
}
