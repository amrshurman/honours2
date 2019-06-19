
public class mainClass {
	 public static void main (String[] args) 
	    { 
		 Mushrooms mushrooms = new Mushrooms(); 
	        Meat meat = new Meat("Steak", "Chicken"); 
	        Peppers peppers = new Peppers("Green"); 
	        
	        PizzaMaker ingredientDirectory = new PizzaMaker(); 
	        ingredientDirectory.addIngredient(mushrooms); 
	        ingredientDirectory.addIngredient(meat); 
	        ingredientDirectory.addIngredient(peppers); 
	        
	        ingredientDirectory.showDetails();
	    }
}
//https://www.geeksforgeeks.org/composite-design-pattern/