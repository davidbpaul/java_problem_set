
public class Printer {
	private int toner_level;
	private int number_of_pages;
	private boolean duplex;
	public Printer(int toner_level, boolean duplex) {
		if(toner_level >-1 && toner_level <= 100){
			this.toner_level = toner_level;
		}else{
			this.toner_level = -1;	
		}
		this.number_of_pages = 0;
		this.duplex = duplex;
	}
	public int fill_toner(int tonerAmount){
		if(toner_level >0 && toner_level <= 100){
			if(this.toner_level + tonerAmount > 100){
				return -1;
			}
			this.toner_level += tonerAmount;
			return this.toner_level;
		}else{
			return -1;
		}
	}
	public int print_pages(int number){
		int print_out = number;
		if(duplex){
			print_out /= 2;
		}
		return this.number_of_pages += print_out;
	}
	public int getNumber_of_pages() {
		return number_of_pages;
	}
	
}
