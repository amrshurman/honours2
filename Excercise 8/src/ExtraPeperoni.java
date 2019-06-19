
public class ExtraPeperoni extends PizzaDecorator{

	public ExtraPeperoni(Pizza p) {
		super(p);
	}
	
	@Override
	public String decorate(){
		return super.decorate()+"Extra Peperoni($2) added bumping order total to $" + cost()+ "\n";
	}
	public int cost() {
		return super.cost()+2;
	}
}
