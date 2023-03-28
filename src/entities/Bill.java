package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	double total;
	
	public double feeding() {
			
			total = barbecue * 7.0 + beer * 5.0 + softDrink * 3.0;
			return total;
		
	}
	
	public double couver() {
		
		if (total > 30.00) {
			return 0.00;
		}
		else {
			return 4.00;
		}
	
	}
	
	public double ticket() {
		
		if (gender == 'M') {
			
			return 10.00;
		}
		else {
			
			return 8.00;
		}
		
	
	}
	
	public double total() {
		return ticket() + couver() + feeding();
	}
}
