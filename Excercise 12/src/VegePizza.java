
public class VegePizza implements Pizza{
	int cost=10;
	  @Override
	   public void order() {
	      System.out.println("An order for a vege pizza has been placed for " + cost + " bucks. ");
	   }
}
