package Que3;
import java.util.*;
public class que3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Area of Circle\n2. Circumference of Circle\n3. Exit");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		float r;
		switch(choice) {
			case 1:
				System.out.println("Enter Radius of Circle : ");
				r = sc.nextFloat();
				area(r);
				break;
			case 2:
				System.out.println("Enter Radius of Circle : ");
				r = sc.nextFloat();
				circumference(r);
				break;	
			case 3:
				System.exit(0);
				break;			
		}	
	}
	static void area(float r) {
		float c = (float) (3.14*r*r);
		System.out.println("Area of Circle: " +c);
	}
	static void circumference(float r) {
		float c = (float) (2*3.14*r);
		System.out.println("Circumference of Circle: " +c);
	}
	
}
