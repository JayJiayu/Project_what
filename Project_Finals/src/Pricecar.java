import java.util.*;

public class Pricecar extends Profile{
		
	public void calculate(int seat,int date) {
		Customer main = new Customer();
		List<Integer> thisprice = new ArrayList<>();
				
		if(seat == 2) {
			int prices = date*1245;
			thisprice.add(prices);
		}
		if(seat == 3) {
			int prices = date*1360;
			thisprice.add(prices);
		}
		if(seat == 7) {
			int prices = date*1670;
			thisprice.add(prices);
		}
		if(date>0&&date<=31) {	
		main.setPrice(thisprice.get(0));
		System.out.println("Money for hire a car is "+thisprice.get(0));

		}		
	}
}