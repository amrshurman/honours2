
public class DeliveryState implements State{
	EndState endState = new EndState();
	   public void order(Pizza p) {
	      System.out.println("Order for " + p.type +" is getting delivered...");
	      p.setState(this);	
	      endState.order(p);
	   }
}
