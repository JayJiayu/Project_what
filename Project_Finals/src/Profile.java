import java.util.*;

public class Profile{
	
	public String CustomerName() {
		Scanner sc= new Scanner(System.in); 		
		Customer main = new Customer();
		System.out.print("Input your name : ");
		String Name= sc.nextLine();
		return Name;
	}
	public void Problem() {
		System.out.println("###########");
		System.out.println("Waiting....");
		
	}
	public void Error() {
		System.out.println("###########");
		System.out.println("Not complete....");
		System.out.println("###########");
	}
	public void Contect(String name) {
		System.out.println("Hi "+ name);
		System.out.println("We got the problem right now ");
		System.out.println("Pls contect back us ...");
		System.out.println("Phone 099-999-9999");
	}
}
