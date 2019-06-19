
public class PizzaExtraCheeseFactory extends AbstractFactory{
	 @Override
	   public Pizza getPizza(String p){    
	      if(p.equalsIgnoreCase("1")){
	         return new PeperoniPizzaExtraCheese();         
	      }else if(p.equalsIgnoreCase("2")){
	         return new VegePizzaExtraCheese();
	      }	 
	      return null;
	   }
}
