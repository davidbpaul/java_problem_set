public class Main {

	public static void main(String[] args) {
	
		Printer printer = new Printer(50, false);
		System.out.println("initial page count = " + printer.getNumber_of_pages());
		int pagesPrinted = printer.print_pages(4);
		System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumber_of_pages());
	}

}