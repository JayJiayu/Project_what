
public class Dataofcars {
	public void printDetailcars(int seat,String brand,Customer customers) {
		
		MainShop main = new MainShop();
		
		System.out.println("You can select ...");
		if(seat == 2) {
			try {
			if(brand.equals("Toyota")) {
				System.out.println("1.Toyota Hillux Revo Standard Cab");
				System.out.println("2.Toyota GR Supra");
				System.out.println("3.Toyota C+pod");
				customers.setModels(main.SelectModel(seat,brand));
			}
			if(brand.equals("Ford")) { 
				System.out.println("1.Ford Mustang");
				System.out.println("2.Ford Ranger");
				System.out.println("3.Ford Raptor");
				customers.setModels(main.SelectModel(seat,brand));
			}
			if(brand.equals("Nissan")) {
				System.out.println("1.Nissan Z Proto (Z35)");
				System.out.println("2.Nissan Navara Single Cab");
				System.out.println("3.Nissan GT-R R34");
				customers.setModels(main.SelectModel(seat,brand));
				}
			}
			catch(Exception e) {
				System.out.println("Error...");
				customers.setCheckElse(false);
			}
		}
		else if(seat == 4) {
			try {
			if(brand.equals("Toyota")) {
				System.out.println("1.Toyota Camry");
				System.out.println("2.Toyota Corolla Cross");
				System.out.println("3.Toyota C-HR");
				customers.setModels(main.SelectModel(seat,brand));
			}
			if(brand.equals("Ford")) {
				System.out.println("1.Ford Ranger ");
				System.out.println("2.Ford Raptor");
				System.out.println("3.Ford Fx4Max");
				customers.setModels(main.SelectModel(seat,brand));
			}
			if(brand.equals("Nissan")) {
				System.out.println("1.Nissan Kicks");
				System.out.println("2.Nissan Almera");
				System.out.println("3.-----------");
				customers.setModels(main.SelectModel(seat,brand));
				}
			}
			catch(Exception e) {
				System.out.println("Error...");
				customers.setCheckElse(false);
			}
		}
		else if(seat == 7) {
			try {
			if(brand.equals("Toyota")) {
				System.out.println("1.Toyota Veloz");
				System.out.println("2.Toyota Sienta");
				System.out.println("3.Toyota Land Cruiser");
				customers.setModels(main.SelectModel(seat,brand));
			}
			if(brand.equals("Ford")) {
				System.out.println("1.Ford Everest ");
				System.out.println("2.-----------");
				System.out.println("3.-----------");
				customers.setModels(main.SelectModel(seat,brand));
			}
			if(brand.equals("Nissan")) {
				System.out.println("1.Nissan Serena MPV");
				System.out.println("2.Nissan Terra");
				System.out.println("3.Nissan Livina");
				customers.setModels(main.SelectModel(seat,brand));
					}
				}
			catch(Exception e) {
				System.out.println("Error...");
				customers.setCheckElse(false);
			}
		}
		else {
			System.out.println("Error...");
			customers.setCheckElse(false);
		}
	}
}
