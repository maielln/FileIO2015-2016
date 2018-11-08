import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
import java.util.StringTokenizer;

public class FileIOExample1
{
	public static void main (String[] args)
	{
		try
 		{
           	FileReader reader = new FileReader("Macbeth.txt");			//Open File For Reading
            BufferedReader in = new BufferedReader(reader);			//Buffer Data For Editing

            boolean done = false;
            while (!done)	//Read through the file until you have reached the end of the file
            {
				String nextLine = in.readLine();	//Read in a line at a time
                if (nextLine == null)				//You've reached the end of the file
                	done = true;
                else
                {
					StringTokenizer tokenizer = new StringTokenizer(nextLine, "\n");	//Tokenize the line into individual words
                    while (tokenizer.hasMoreTokens())
                    {
						String Tokens = tokenizer.nextToken();
						System.out.println(Tokens);
					}
				}
			}
			reader.close();			//close file

		}//END TRY

        catch(IOException e)		//catch any IO errors while reading
        {
			System.out.println("ERROR occured while reading data. " + e);
			System.exit(1);
        }//END CATCH

	}

}




