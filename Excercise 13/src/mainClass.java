import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Pizza p = new Pizza(null);
		Scanner input = new Scanner(System.in); 
		  String type="";
		System.out.println("Press (1) to order a peperoni pizza. Press (2) to order a vege Pizza.") ; 
		  type = input.nextLine();
		  if (type.equals("1")) {
	      p = new Pizza("Peperoni Pizza");
		  }
		  if (type.equals("2")) {
		      p = new Pizza("Vege Pizza");
			  }
	      StartState startState = new StartState();
	      startState.order(p);

	   }
}

//https://www.tutorialspoint.com/design_pattern/state_pattern.htm