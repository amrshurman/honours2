
public class EndState implements State{
	
	   public void order(Pizza p) {
	      System.out.println("Order for " +p.type + " delivered and completed successfully");
	      p.setState(this);	
	   }
}
