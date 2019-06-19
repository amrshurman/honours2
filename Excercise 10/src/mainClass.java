
public class mainClass {
	public static void main(String[] args) {

	      Pizza p  = new Pizza("Large","Thin",true);

	      PizzaView view = new PizzaView();

	      PizzaController controller = new PizzaController(p, view);

	      controller.updateView();

	      //update model data
	      controller.setSize("Medium");
	      controller.setExtraCheese(false);

	      controller.updateView();
	   }

}

//https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm