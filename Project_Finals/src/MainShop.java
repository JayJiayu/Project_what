import java.util.*;

public class MainShop extends Customer{
		static Customer customers = new Customer();
	
		public void start() {
			
			 printWelcome();
			 printDescriptions();
			 System.out.println(customers.toString()+"\n");
			 printDetailcars(customers.getSeats(),customers.getBrands(),customers);
			 if(customers.getCheckElse()) {
			 customers.setDate(Selectdate());}
			 if(customers.getCheckElse()) {
			 customers.calculate(customers.getSeats(),customers.getDate());		 
			 }
		}
		private void printDescriptions() {
			
			System.out.println("What will you choose a type of cars");
			System.out.println("1. 2 seats");
			System.out.println("2. 4 seats");
			System.out.println("3. 7 seats");
			System.out.println("########################");
			
			int selects = Select();	
			
			if(selects == 1) {
				customers.setSeats(selects);
				twoseats(customers);
			}
			if (selects == 2) {
				customers.setSeats(selects);
				fourseats(customers);

			}
			if (selects == 3) {
				customers.setSeats(selects);
				selvenseats(customers);
			}
		}
		private void twoseats(Customer customers) {
			printdetail(customers);
								
		}
		private void fourseats(Customer customers) {
			printdetail(customers);
			
		}
		private void selvenseats(Customer customers) {
			printdetail(customers);
			
		}
		private int Selectdate() {
			Scanner sc= new Scanner(System.in);
			int date = 0;
			try {
				WrongNumberException wrongnumber = new WrongNumberException();
				System.out.print("How many days do you want for hire :");
				date = sc.nextInt();
				wrongnumber.Checkdate(date);	
				if(customers.getCheckElse()) {
				customers.setDate(date);
				}
			}
			catch(Exception e) {
				System.out.println("Date is a number");
			}
			return date;
		}
		private void printdetail(Customer customers) {
			System.out.println("########################");
			System.out.println("What will you choose a brands of cars");
			System.out.println("1. Toyota");
			System.out.println("2. Ford");
			System.out.println("3. Nissan");
			
			int selects = Select();	
			if(selects == 1) {
				
				customers.setBrands("Toyota");
			}
			else if (selects == 2) {
				
				customers.setBrands("Ford");
			}
			else if (selects == 3) {
				
				customers.setBrands("Nissan");
			}
			
		}
		public void printDetailcars(int seat,String brand,Customer customers) {
			Dataofcars cars = new Dataofcars();
			cars.printDetailcars(seat,brand,customers);
		}
		
		private void printWelcome() {
			
			System.out.println("########################\n");
			System.out.println("Welcome to Suratan morter \n");
			System.out.println("########################");
			
		}
		public int Select() {
			
			int choice = 0;
			try {
			while(choice<1 || choice>3) {
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter your choice: ");
				choice = sc.nextInt(); {
					if(choice<1 || choice>3)
				System.out.println("Pls Enter a correct choice");
					}	
				}
			}
			catch(Exception e) {
				System.out.println("Pls Enter in number");
			}
			return choice;		
		}
		public int SelectModel(int seat,String brand) {
			
			int choice =0;
			try {
			while(choice<1 || choice>3) {
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter your choice: ");
				choice = sc.nextInt(); 
					if(choice<1 || choice>3) {
						System.out.println("Pls Enter a correct choice");
					}
					else if(seat == 4) {
						if(brand.equals("Nissan")) {
							if(choice == 3) {
							System.out.println("Pls Enter a correct choice");
							SelectModel(4,"Nissan");
							}
						}
					}
					else if(seat == 7) {
						if(brand.equals("Ford")) {
							if(choice == 2) {
								System.out.println("Pls Enter a correct choice");
								SelectModel(7,"Ford");
							}
							if(choice == 3) {
								System.out.println("Pls Enter a correct choice");
								SelectModel(7,"Ford");
							}
						}
					}
				}
			}
			catch(Exception e) {
				System.out.println("Pls Enter in number");
				customers.setCheckElse(false);
			}
			return choice;		
		}
		
	public static void main(String[] args) {
				
		MainShop cum = new MainShop();
		cum.start();
		if(cum.getCheckElse()) {		
			cum.setName(cum.CustomerName());
			for(int i =0 ; i<3;i++) {
				cum.Problem();
			}
			cum.Error();
			cum.Contect(cum.getName());
			}
		}
	}
