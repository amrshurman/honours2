
class PeperoniPizzaCreator implements PizzaMaker {
	 private CreatePizza CreatedPizza;

	    public PeperoniPizzaCreator(String size) {
	        this.CreatedPizza = new CreatePizza(size+" Peperoni Pizza");
	    }

	    @Override
	    public CreatePizza getCreatedPizza() {
	        return CreatedPizza;
	    }
}
