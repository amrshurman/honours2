
public class PizzaFactory extends AbstractFactory{
	 @Override
	   public Pizza getPizza(String p){    
	      if(p.equalsIgnoreCase("1")){
	         return new PeperoniPizza();         
	      }else if(p.equalsIgnoreCase("2")){
	         return new VegePizza();
	      }	 
	      return null;
	   }
}
