import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String name = "Natch Sirisumpun";
		
		System.out.println("Hello Git");
		System.out.println("I am " + name);
		
		System.out.println("Enter rectangle width :");
		int width = kb.nextInt();
		System.out.println("Enter rectangle height :");
		int height = kb.nextInt();
		
		System.out.println("The rectangle area is " + width*height);
	}

}
