
public class mainClass {
	 public static void main(String[] args) {
		 CreatePizza cr;
	        PizzaMaker pm = null;
	       
	            pm = new PeperoniPizzaCreator("Big");
	            
	        cr = pm.getCreatedPizza();
	        System.out.println(cr);
	        
	        pm = new VegePizzaCreator("Small",true);
	        cr = pm.getCreatedPizza();
	        System.out.println(cr);
	    }
}
//https://sourcemaking.com/design_patterns/factory_method/java/1