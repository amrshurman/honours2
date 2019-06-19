
public class FactoryProducer {
	 public static AbstractFactory getFactory(boolean extraCheese){   
	      if(extraCheese==true){
	         return new PizzaExtraCheeseFactory();         
	      }else{
	         return new PizzaFactory();
	      }
	   }
}
