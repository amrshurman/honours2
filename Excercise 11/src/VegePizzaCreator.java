
class VegePizzaCreator implements PizzaMaker {
	 private CreatePizza CreatedPizza;

	    public VegePizzaCreator(String size, boolean extraCheese) {
	    	if (extraCheese==false) {
	        this.CreatedPizza = new CreatePizza(size+" Vege Pizza");
	    	}
	    	else {
	    		 this.CreatedPizza = new CreatePizza(size + " Extra cheese Vege Pizza");
	    	}
	    }
	    

	    @Override
	    public CreatePizza getCreatedPizza() {
	        return CreatedPizza;
	    }
}
