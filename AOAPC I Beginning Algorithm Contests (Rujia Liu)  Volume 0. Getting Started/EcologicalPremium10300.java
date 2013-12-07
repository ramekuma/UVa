import java.util.Scanner;

/**
 * @author ramekuma
 *
 */
public class EcologicalPremium10300 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        while(in.hasNext())
        {
        	int number_of_test_cases = in.nextInt();
        	while(number_of_test_cases > 0)
        	{
        		int number_of_farmers = in.nextInt();
        		Long total_premimum = 0L;
        		while(number_of_farmers > 0)
        		{
        			Long size_of_farm = in.nextLong();
        			Long number_of_animals = in.nextLong();
        			Long eco_param = in.nextLong();
        			total_premimum = total_premimum + (size_of_farm * eco_param);
        			number_of_animals = number_of_animals - 1;
        			number_of_farmers--;
        		}
        		System.out.println(total_premimum);
        		number_of_test_cases--;
        	}
        }
       in.close();
	}
}
