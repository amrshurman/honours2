
public abstract class PizzaDecorator implements Pizza{
protected Pizza p;
	public PizzaDecorator(Pizza p){
		this.p=p;

	}
	@Override
	public String decorate() {
		return this.p.decorate();
	}
	public int cost() {
		return this.p.cost();
	}
}
