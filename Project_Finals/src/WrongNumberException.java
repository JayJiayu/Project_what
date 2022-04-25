
public class WrongNumberException extends Exception {
	MainShop main = new MainShop();
	
	public void CheckNumber(int number) throws WrongNumberException {		
		if((number<=0)) {
			System.out.println("Pls input in positive numbers.");
			main.setCheckElse(false);
			throw new WrongNumberException();			
			}
		if(number<main.getMoney()) {
			System.out.println("Pls input money more than price.");
			main.setCheckElse(false);
			throw new WrongNumberException();
		}
	}

	public void Checkdate(int date) {
		if(date<=0) {
			System.out.println("Pls input in positive numbers.");
			main.setCheckElse(false);
		}
		if(date>31) {
			System.out.println("Don't hire over 1 month.");
			main.setCheckElse(false);
		}
		
	}
}