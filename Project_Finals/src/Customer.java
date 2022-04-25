import java.sql.Array;

public class Customer extends Pricecar{
	
	private int seat;
	private String brand;
	private int model;
	private int date;
	private boolean checkelse = true;
	private int price;
	private int moneys;
	private String name;
	
	public String toString() {
		return "Do choose "+this.brand+" and your seats are "+ this.seat ;
	}
	
	public int getSeats() {		
		return seat;
	}
	public void setSeats(int seat) {
		if(seat == 1) {
			this.seat = 2;
		}
		if(seat == 2) {
			this.seat = 4;
		}
		if(seat == 3) {
			this.seat = 7;
		}
	}
	public String getBrands() {
		return brand;
	}
	public void setBrands(String brand) {
		this.brand = brand;
	}
	public int getModels(){
		return model;
	}
	public void setModels(int model) {
		this.model = model;	
	}
	public int getDate(){
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public boolean getCheckElse(){
		return checkelse;
	}
	public void setCheckElse(boolean checkelse) {
		this.checkelse = checkelse;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMoney(){
		return moneys;
	}
	public void setMoney(int moneys) {
		this.moneys = moneys;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
