import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
			int INTEGER;
		    System.out.printf("Type an Integer: "); //ask for INT
		    Scanner a = new Scanner(System.in);
		    INTEGER = a.nextInt(); //goes to the next INT
		 
		    if ( INTEGER % 2 == 0 ) //checks to see if it is EVEN by seeing if it is divisible by 2
		      System.out.printf("It is an Even");
		    else // If it isn't even it must be odd
		      System.out.printf("It is an Odd");

	}

}
