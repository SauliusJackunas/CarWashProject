package SimpleCarWash;

import java.time.LocalDateTime;

public class Invoice {

	LocalDateTime date;
	Program program;

	public Invoice(LocalDateTime date, Program program) {

		this.date = date;
		this.program = program;
	}

	@Override
	public String toString() {
		return "Invoice: " + "\n" + "Starting date and time: " + date + "\n" + "Name of the selected program = "
				+ program.getName() + "\n" + "price: " + program.getPrice() + " EUR \n" + "End of the program. "
				+ LocalDateTime.now() + "\n";
	}
}
