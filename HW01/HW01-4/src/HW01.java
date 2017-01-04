import java.util.Scanner;
public class HW01 {

	public static void main(String[] args) {
		        Scanner a = new Scanner(System.in);

		        double weight, height, bmi; //used to calculate BMI and store inputs
		    

		        System.out.print("What is your weight in pounds: "); //find out weight
		        weight = a.nextInt();
		        System.out.print("What is your height in inches: "); //find out height
		        height = a.nextInt();

		        bmi = ((weight * 703)/(height * height)); //calculate BMI

		        System.out.printf("\nYour BMI is %f", bmi); //tell them what their BMI is

		        System.out.printf("\n\nBMI VALUES"); //Show if they are over under ect.
		        System.out.printf("\nUnderweight: less than 18.5");
		        System.out.printf("\nNormal: between 18.5 and 24.9");
		        System.out.printf("\nOverweight: between 25 and 29.9");
		        System.out.printf("\nObese: 30 or greater");
		     }

	}

