import java.util.Scanner;

public class calculations {

	public static void main(String[] args) {

		System.out.print("Enter 1st Number ");
		Scanner x1 = new Scanner(System.in);
		
		int a1 = x1.nextInt();
		
		System.out.print("Enter 2nd Number ");
		Scanner x2 = new Scanner(System.in);
		
		int a2 = x2.nextInt();
		System.out.println("1. for Addition");
		System.out.println("2. for Subtraction");
		System.out.println("3. for Division");
		System.out.println("4. for Multiplication");
		System.out.print("Type Your Choice Number : ");
		Scanner x3 = new Scanner(System.in);
		
		int choice = x2.nextInt();
		switch(choice) {
		case 1:
			int c1=a1+a2;
			System.out.print("Addition of both numbers are : "+c1);
			break;
		case 2:
			int c2=a1-a2;
			System.out.print("Subtraction of both numbers are : "+c2);
			break;
		case 3:
			int c3=a1/a2;
			System.out.print("Division of both numbers are : "+c3);
			break;
		case 4:
			int c4=a1*a2;
			System.out.print("Multiplication of both numbers are : "+c4);
			break;
		default:
			System.out.println("Wrong Choice");
		}

	}

}
