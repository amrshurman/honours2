
public class VegePizzaExtraCheese implements Pizza{
	int cost=12;
	  @Override
	   public void order() {
	      System.out.println("An order for a vege pizza with extra cheese has been placed for " + cost + " bucks. ");
	   }
}
