import java.util.Scanner;

public class HashmatBraveWarrior10055 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        while(in.hasNext())
        {
        	System.out.println(Math.abs(in.nextLong() - in.nextLong()));
        }
        in.close();
	}
}
