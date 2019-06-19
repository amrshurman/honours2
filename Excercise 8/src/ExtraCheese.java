
public class ExtraCheese extends PizzaDecorator{

	public ExtraCheese(Pizza p) {
		super(p);
	}

	@Override
	public String decorate(){
		return super.decorate()+"Extra cheese($3) added bumping order total to $" +cost() + "\n";
	}
	public int cost() {
		return super.cost()+3;
	}
}
