
public class BakeState implements State {
	DeliveryState deliveryState = new DeliveryState();
	
   public void order(Pizza p) {
	   if (p.type.equals("Peperoni Pizza")) {
		   System.out.println("Adding cheese to the dough");  
		   System.out.println("Adding tomatoe sauce to the dough");  
		   System.out.println("Adding Peperoni to the dough"); 
		   System.out.println("Placing Pizza in the oven...");  
	   }
	   if (p.type.equals("Vege Pizza")) {
		   System.out.println("Adding cheese to the dough");  
		   System.out.println("Adding mushrooms to the dough"); 
		   System.out.println("Adding black olives to the dough"); 
		   System.out.println("Adding red peppers to the dough"); 
		   System.out.println("Placing Pizza in the oven...");  
	   }
      System.out.println("Order for " +p.type + " baked.");
      p.setState(this);	
      deliveryState.order(p);
   }

}