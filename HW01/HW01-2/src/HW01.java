
import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		double radius, pi = 3.14, area;
		
		Scanner a = new Scanner(System.in);
		System.out.printf("What Radius do You Want: ", args);
		radius = a.nextInt();
		area = pi*radius*radius;
		System.out.printf("Your area is: "+area, args);

	}

}
