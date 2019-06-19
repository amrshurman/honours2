
public class PeperoniPizza implements Pizza{

	@Override
	public String decorate() {
		return "Peperoni Pizza ordered for $10 \n";
	}

	public int cost() {
		return 10;
	}
	
}
