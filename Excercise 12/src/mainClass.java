import java.util.Scanner;
public class mainClass {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in); 
		  String type="";
		  String extraCheese="";
		  System.out.println("Enter 1 to order a peperoni pizza. Enter 2 to order a vege Pizza.");
		  type = input.nextLine();
		  System.out.println("Would you want extra cheese on the pizza?(y/n).");
		  extraCheese=input.nextLine();
		  if (type.equals("1")) {
			  if (extraCheese.equals("y")) {
				  AbstractFactory PizzaFactory1 = FactoryProducer.getFactory(true);
			      Pizza p1 = PizzaFactory1.getPizza("1");
			      p1.order();  
			  }
			  if (extraCheese.equals("n")) {
				  AbstractFactory PizzaFactory1 = FactoryProducer.getFactory(false);
				  Pizza p2 = PizzaFactory1.getPizza("1");
			      p2.order();
			  }
		  }
		  if (type.equals("2")) {
			  if (extraCheese.equals("y")) {
				  AbstractFactory PizzaFactory1 = FactoryProducer.getFactory(true);
			      Pizza p1 = PizzaFactory1.getPizza("2");
			      p1.order();  
			  }
			  if (extraCheese.equals("n")) {
				  AbstractFactory PizzaFactory1 = FactoryProducer.getFactory(false);
				  Pizza p2 = PizzaFactory1.getPizza("2");
			      p2.order();
			  }
		  }
	      
	   }
}
