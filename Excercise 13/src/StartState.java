public class StartState implements State {
	BakeState bakeState = new BakeState();
   public void order(Pizza p) {
      System.out.println("Order for " + p.type +" in progress...");
      p.setState(this);	
      bakeState.order(p);
   }

}