package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.Scanner;

		class Average extends LeapYear {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
			System.out.println("Enter year");
			int Year = in.nextInt();
			
			boolean isLeapYear = Year % 4 == 0;
			boolean isLeapYear1 = Year % 400 == 0;
			boolean isLeapyear2 = Year % 100 != 0;
			
			System.out.print(isLeapYear && isLeapYear1 || isLeapyear2);
			
		
				
				

	}
		}
}
}