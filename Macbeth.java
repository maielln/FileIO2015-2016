import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
import java.util.StringTokenizer;

public class Macbeth
{
	public static void main (String[] args)
	{
		try
 		{
           	FileReader reader = new FileReader("macbeth.txt");			//Open File For Reading
            BufferedReader in = new BufferedReader(reader);			//Buffer Data For Editing
            int acount = 0;
            int ecount = 0;
            int icount = 0;
            int ocount = 0;
            int ucount = 0;

            boolean done = false;
            while (!done)	//Read through the file until you have reached the end of the file
            {
				String nextLine = in.readLine();	//Read in a line at a time
                if (nextLine == null)				//You've reached the end of the file
                	done = true;
                else
                {
					StringTokenizer tokenizer = new StringTokenizer(nextLine);	//Tokenize the line into individual words
                    while (tokenizer.hasMoreTokens())
                    {
						String Tokens = tokenizer.nextToken();

						for(int i = 0; i < Tokens.length(); i++)
						{
							String letter = Tokens.substring(i, i +1).toLowerCase();
							if (letter.equals("a"))
								acount++;
							else if (letter.equals("e"))
								ecount++;
							else if (letter.equals("i"))
								icount++;
							else if (letter.equals("o"))
								ocount++;
							else if (letter.equals("u"))
								ucount++;

						}
					}
				}
			}
			System.out.println("A's: " + acount);
			System.out.println("E's: " + ecount);
			System.out.println("I's: " + icount);
			System.out.println("O's: " + ocount);
			System.out.println("U's: " + ucount);
			reader.close();			//close file

		}//END TRY

        catch(IOException e)		//catch any IO errors while reading
        {
			System.out.println("ERROR occured while reading data. " + e);
			System.exit(1);
        }//END CATCH

	}

}




