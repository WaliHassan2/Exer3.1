/**
 * date 9/29/2015
 * @author walihassan
 *
 */

public class RunCommands {
/**
 * This is a main method
 * @param args arguments for user input during run java command
 */
	public static void main(String[] args) {
		/*Below outlines a few facts of India's space probe to Mars
		 * The numbers provided are approximations of numbers listed on the Internet
		 */
		float trip1 = 485000000;
		//length of trip in miles
		float fuel = 400000;
		//weight of fuel in fluid pounds
		double trip2 = 300.0;
		// length of trip in days
		int price = 72;
		// cost in millions
		float fuel2 = trip1/fuel;
		// fuel used per day if velocity kept at a constant rate
		char alpha = 'a';
		String india = "The mission to Mars";
		float distance = trip1/(float)trip2;
		System.out.printf("%19s cost $%2d million.", india, price);
		System.out.printf("\nThe amount of propellant used per day is %5.1f fluid pounds.", fuel2);
		System.out.printf("\nIndia's probe travels %e miles per day towards Mars.", distance);
		System.out.printf("\nIndia is now a grade %C space explorer!", alpha);
	}

}
