import java.io.IOException;
import java.util.Scanner;

/**
 * @author ramekuma
 *
 */
public class KinderGartenCountingGame494 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
        
        while(in.hasNext())
        {
        	String nextLine = in.nextLine();
        	int count = 0;
        	boolean hasWordBegun = false;
        	for (char c : nextLine.toCharArray())
        	{
        		if(Character.isLetter(c))
        		{
        			if(!hasWordBegun)
        			{
        				hasWordBegun = true;
        				count++;
        			}
        		}
        		else
        			hasWordBegun = false;
        	}
        	System.out.println(count);
        }
       in.close();
    }
}
