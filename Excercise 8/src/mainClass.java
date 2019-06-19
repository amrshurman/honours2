
public class mainClass {
	public static void main(String[] args) {
		Pizza extraCheese = ((new ExtraPeperoni(new ExtraCheese(new PeperoniPizza()))));
		System.out.println(extraCheese.decorate());
	}
}
