import java.util.StringTokenizer;
Import java.util.Scanner;
public class words
{	public static void main (String [] args)
	{	Scanner in = new Scanner(System.in);
		System.out.println(“Enter Words:”);
		int count = 0;
		boolean done = false;
		while (!done)
		{
		   String inputLine = in.nextLine();
		   if (inputLine == null)
		     done = true;
		   else
		   {
	   	StringTokenizer tokenizer = new 						StringTokenizer(inputLine);
			while (tokenizer.hasMoreTokens())
			{
			   tokenizer.nextToken();
			   count++;
			}
		     }
		System.out.println(count + “ words”);
		}
	}
}
