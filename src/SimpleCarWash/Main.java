package SimpleCarWash;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int selection = -1;
		Program program = null;
		
		do {
			System.out.println("Please select your prefered program: 1 - Simple, 2 - Basic, 3 - Magic, 0 - exit");
			
			try {
			selection = in.nextInt();
			
			switch (selection) {
			//Exits the program
			case 0:
				break;
				//Selecting the 1st program
			case 1 :
				program = new Program("simple",  10);
				System.out.println("You have selected a SIMPLE program: washing + drying \n\n");
				System.out.println(program.getSimple());
				break;
				//Selecting the 2nd program
			case 2 :
				program = new Program("basic",  50);
				System.out.println("You have selected a BASIC program: washing + drying + polishing \n\n");
				System.out.println(program.getBasic());
				break;
				//selecting the 3rd program
			case 3 :
				program = new Program("magic",  100);
				System.out.println("You have selected the MAGIC program: washing + drying + polishing + waxing \n\n");
				System.out.println(program.getMagic());
				break;
			default :
				break;
			}
			Invoice invoice = new Invoice(LocalDateTime.now(), program);

			System.out.println(invoice.toString());
			
			System.out.println("Your vehicle is clean. You can wash it again if you like.");
			
			} catch (Exception e) {
				System.out.println("There is no such program. Please try again.");
				in.skip(".*");
			}
		} while (selection != 0);
		
		System.out.println("THANK YOU for choosing our services. Hoping to see you back!");
		
	}

}
