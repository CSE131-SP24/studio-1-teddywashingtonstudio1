package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean isOrdered = (x<y && y<z);
	//if(x<y && y<z) {
		//isOrdered = true;
		
	//}
		System.out.print(isOrdered);
	}

	/**
	 * Says hello to the supplied argument
	 */
	public static void main  (String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for args 0: ");
		String name = in.nextLine();
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//
	
			System.out.print("Hi, " + name + ". How are you?");
		
		}

}
